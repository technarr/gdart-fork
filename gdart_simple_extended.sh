#!/bin/bash
#
# Dieses Skript kann entweder mit dem Namen (bzw. Pfad) einer einzelnen Java-Klasse
# oder mit einem Verzeichnis als Input aufgerufen werden.
# Beispiel Aufruf:
#   ./gdart_simple_extended.sh ./examples/Example5 [cp-element ...]
#   oder
#   +/myTestDir [cp-element ...]
#

# Setze OFFSET auf das Verzeichnis, in dem dieses Skript liegt.
OFFSET=$(dirname "$BASH_SOURCE")
if [ -z "$OFFSET" ]; then
  OFFSET="."
fi

# Wechsle in das OFFSET-Verzeichnis (damit relative Pfade passen).
cd "$OFFSET" || { echo "Failed to change directory to $OFFSET"; exit 1; }

# Lade Konfiguration, falls vorhanden.
[ -f "./config" ] && source "./config"

# Definiere Umgebungsvariablen
SPOUT="$GRAALVM_HOME/java"
JAVAC="$GRAALVM_HOME/javac"

DSE="-Dconcolic.execution=true -Ddse.witness=false -Ddse.b64encode=true"
TAINT="-Dtaint.flow=OFF"
SOLVER="-Ddse.dp=cvc5"
SOLVER_FLAGS="-Ddse.witness=true -Ddse.b64encode=true -Ddse.dp.incremental=true -Ddse.coveragereport=true"
SOLVER_FLAGS="$SOLVER_FLAGS $SOLVER"

# Prüfe, ob mindestens ein Argument übergeben wurde
if [ "$#" -lt 1 ]; then
  echo "Usage: $0 <main-class-path | directory> [cp-element ...]"
  exit 1
fi

# Speichere erstes Argument als Input (entweder Klassenname / Pfad oder Verzeichnis)
input_path="$1"
shift
# Die restlichen Argumente (falls vorhanden) dienen als zusätzliche cp-Elemente.
cp_elements=("$@")

# Unterscheide, ob wir im Directory- oder im Single-Datei-Modus arbeiten:
if [ -d "$input_path" ]; then
  mode="directory"
  echo "Operating in directory mode. Recursively processing .java files in $input_path"
  # Lese alle .java-Dateien (rekursiv) in ein Array ein:
  mapfile -t java_files < <(find "$input_path" -type f -name "*.java")
  if [ "${#java_files[@]}" -eq 0 ]; then
    echo "No .java files found in directory $input_path"
    exit 1
  fi
else
  mode="single"
  # Falls $input_path bereits eine Datei ist, nutze diese, sonst gehe davon aus, dass
  # die Datei im OFFSET-Verzeichnis unter $input_path.java zu finden ist.
  if [ -f "$input_path" ]; then
    java_files=("$input_path")
  else
    if [ -f "$OFFSET/$input_path.java" ]; then
      java_files=("$OFFSET/$input_path.java")
    else
      echo "Could not find file: $input_path or $OFFSET/$input_path.java"
      exit 1
    fi
  fi
fi

# Arrays zur Zusammenfassung der Ergebnisse
declare -a successes
declare -a failures

# Hilfsfunktion: Kopiere Verifier.java in das coverage-report-Verzeichnis (nur, wenn nicht bereits vorhanden)
copy_verifier() {
  VERIFIER_SRC="verifier-stub/src/main/java/tools/aqua/concolic/Verifier.java"
  VERIFIER_DEST="coverage-report/src/main/java/tools/aqua/concolic/Verifier.java"
  VERIFIER_DEST_DIR="coverage-report/src/main/java/tools/aqua/concolic"
  if [ ! -f "$VERIFIER_DEST" ]; then
    echo "Copying Verifier.java to coverage-report..."
    mkdir -p "$VERIFIER_DEST_DIR"
    cp "$VERIFIER_SRC" "$VERIFIER_DEST" || { echo "ERROR: Failed to copy Verifier.java"; exit 1; }
  fi
}

# --- Verarbeitung jeder gefundenen .java-Datei ---
for file in "${java_files[@]}"; do
  # Ermittele den Klassennamen (ohne .java)
  mainclass=$(basename "$file" .java)
  echo "=========================================="
  echo "Processing class: $mainclass"
  echo "Source file: $file"
  echo "=========================================="
  
  # Erstelle ein temporäres Verzeichnis für diesen Durchlauf
  tmpdir=$(mktemp -d)
  if [ ! -d "$tmpdir" ]; then
    echo "Failed to create temporary directory for $mainclass. Skipping."
    failures+=("$mainclass (tmpdir creation failed)")
    continue
  fi

  # Setze classpath auf das temporäre Verzeichnis
  classpath="$tmpdir"

  # Kopiere die .java-Datei in das temporäre Verzeichnis
  mainjava="$tmpdir/${mainclass}.java"
  cp "$file" "$mainjava" || { 
      echo "Failed to copy $file to $mainjava. Skipping."; 
      failures+=("$mainclass (copy failed)"); 
      rm -rf "$tmpdir"; 
      continue; 
  }
  echo "Copied $file to $mainjava"

  # Verarbeite alle zusätzlichen cp-Elemente
  for cp_element in "${cp_elements[@]}"; do
      if [ -d "$cp_element" ]; then
          cp -a "$cp_element"/* "$tmpdir/" 2>/dev/null
      else
          classpath="$classpath:$cp_element"
      fi
  done

  # Führe die sed-Ersetzung in allen .java-Dateien im classpath durch
  if [[ "$OSTYPE" == "darwin"* ]]; then
      find "$classpath" -name "*.java" -exec sed -i "" -e "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;
  else
      find "$classpath" -name "*.java" -exec sed -i "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;
  fi

  # Hänge den Verifier Stub JAR an den classpath an
  classpath="$classpath:$OFFSET/verifier-stub/target/verifier-stub-1.0.jar"

  # Setze die vollständigen Pfade für javac und java
  JAVAC="$OFFSET/$JAVAC"
  JAVA="$OFFSET/$SPOUT"

  # Kompiliere die Java-Datei
  echo "Compiling $mainjava with classpath: $classpath"
  $JAVAC -cp "$classpath" "$mainjava"
  if [ $? -ne 0 ]; then
      echo "Compilation failed for $mainclass"
      failures+=("$mainclass (compilation failed)")
      rm -rf "$tmpdir"
      continue
  fi

  # Kopiere die Java-Datei in das coverage-report-Verzeichnis
  DEST_DIR="coverage-report/src/main/java"
  mkdir -p "$DEST_DIR"
  cp "$mainjava" "$DEST_DIR/"
  if [ $? -eq 0 ]; then
      echo "Successfully copied $mainjava to $DEST_DIR/"
  else
      echo "ERROR: Failed to copy $mainjava to $DEST_DIR/"
      failures+=("$mainclass (copy to coverage-report failed)")
      rm -rf "$tmpdir"
      continue
  fi

  # Kopiere Verifier.java (einmalig)
  copy_verifier

  # Führe den DSELauncher (GDart) für diese Klasse aus
  echo "Running DSE for class $mainclass..."
  $JAVA -cp "$OFFSET/dse/target/dse-0.0.1-SNAPSHOT-jar-with-dependencies.jar" \
        tools.aqua.dse.DSELauncher \
        $SOLVER_FLAGS \
        -Dproject.root="$OFFSET" \
        -Ddse.executor="$OFFSET/executor.sh" \
        -Ddse.executor.args="-cp $classpath $DSE $TAINT $mainclass" \
        -Ddse.sources="$classpath" > "_gdart_${mainclass}.log" 2> "_gdart_${mainclass}.err"
  exit_code=$?
  
  # Schreibe die Logs mit einer passenden Überschrift in die Konsole
  echo "----- DSE Log for $mainclass -----"
  cat "_gdart_${mainclass}.log"
  echo "----- DSE Errors for $mainclass -----"
  cat "_gdart_${mainclass}.err"
  
  if [ $exit_code -ne 0 ]; then
      echo "DSE execution failed for $mainclass. Removing its copy from coverage-report."
      rm -f "$DEST_DIR/${mainclass}.java"
      failures+=("$mainclass (DSE execution failed)")
  else
      echo "DSE execution succeeded for $mainclass."
      successes+=("$mainclass")
  fi

  # Aufräumen: Lösche das temporäre Verzeichnis
  rm -rf "$tmpdir"
  echo "------------------------------------------"
done

# Zeige den Inhalt des Test-Verzeichnisses an
TESTS_DIR="coverage-report/src/test/java"
echo "Generated test classes in $TESTS_DIR:"
ls -lah "$TESTS_DIR"

# Führe Maven-Tests aus
POM_PATH="coverage-report/pom.xml"
if [ ! -f "$POM_PATH" ]; then
  echo "POM file $POM_PATH does not exist. Exiting..."
  exit 1
fi

echo "Running Maven tests..."
mvn clean test -f "$POM_PATH"

# Erzeuge ggf. den JaCoCo-Report (wenn in SOLVER_FLAGS dse.coveragereport=true steht)
if [[ "$SOLVER_FLAGS" == *"dse.coveragereport=true"* ]]; then
  echo "Generating JaCoCo coverage report..."
  mvn jacoco:report -f "$POM_PATH"
fi

# Ausgabe der Ergebnis-Zusammenfassung
echo "===== Summary ====="
echo "Succeeded classes:"
for s in "${successes[@]}"; do
  echo "  - $s"
done

echo "Failed classes:"
for f in "${failures[@]}"; do
  echo "  - $f"
done

# Versuche, den JaCoCo-Report im Browser zu öffnen (WSL2: explorer.exe öffnet Windows-Programme)
REPORT_PATH="coverage-report/target/site/jacoco/index.html"
if [ -f "$REPORT_PATH" ]; then
  echo "Opening JaCoCo coverage report: $REPORT_PATH"
  # Konvertiere den Pfad in Windows-Format (wslpath)
  win_report_path=$(wslpath -w "$REPORT_PATH")
  explorer.exe "$win_report_path"
else
  echo "JaCoCo coverage report not found at $REPORT_PATH"
fi
