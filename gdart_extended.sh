#!/bin/bash

# Beispielaufruf:
#   ./gdart_simple_extended.sh ./examples/Example5 [cp-element ...]
#   oder
#   ./gdart_simple_extended.sh ./myTestDir [cp-element ...]
#

# Determine the directory of this script.
OFFSET=$(dirname "$BASH_SOURCE")
if [ -z "$OFFSET" ]; then
  OFFSET="."
fi

# Change to the script's directory.
cd "$OFFSET" || { echo "Failed to change directory to $OFFSET"; exit 1; }

source "$OFFSET/config"

SPOUT="$GRAALVM_HOME/java"
JAVAC="$GRAALVM_HOME/javac"

# : "${DSE:=-Dconcolic.execution=true -Ddse.witness=false -Ddse.b64encode=true}"
# : "${TAINT:=-Dtaint.flow=OFF}"
# : "${SOLVER:=-Ddse.dp=cvc5}"
# : "${SOLVER_FLAGS:=-Ddse.witness=true -Ddse.b64encode=true -Ddse.dp.incremental=true -Ddse.coveragereport=true $SOLVER}"

# Flags von Gdart-SVComp
SOLVER_FLAGS="-Ddse.witness=true -Ddse.dp=cvc5 -Ddse.bounds=true -Ddse.bounds.iter=6 -Ddse.bounds.step=6 -Ddse.explore=bfs -Ddse.b64encode=true -Ddse.coveragereport=true -Djconstraints.multi=disableUnsatCoreChecking=true -Dtaint.flow=OFF"


# Uncomment these lines if you need version info
# echo "Env. Info ---------------------------------------------"
# "$SPOUT" -version
# "$JAVAC" -version
# echo "-------------------------------------------------------"

# ---------------------------
# Create a "runs" directory (at the same level as the script) for storing run results.
# Each run will be saved in a subdirectory named "run_<timestamp>".
# ---------------------------
timestamp=$(date +%Y%m%d_%H%M%S)
RUNS_DIR="$OFFSET/runs"
mkdir -p "$RUNS_DIR" || { echo "Failed to create runs directory"; exit 1; }
RESULTS_DIR="$RUNS_DIR/run_$timestamp"
mkdir -p "$RESULTS_DIR" || { echo "Failed to create results directory"; exit 1; }
echo "Results will be stored in: $RESULTS_DIR"

PARAMS_FILE="$RESULTS_DIR/parameters.txt"
{
  echo "Run Timestamp: $(date)"
  echo "DSE: $DSE"
  echo "TAINT: $TAINT"
  echo "SOLVER: $SOLVER"
  echo "SOLVER_FLAGS: $SOLVER_FLAGS"
} > "$PARAMS_FILE"

# ---------------------------
# 3. Eingabeparameter auswerten
# ---------------------------
if [ "$#" -lt 1 ]; then
  echo "Usage: $0 <main-class-path | directory> [cp-element ...]"
  exit 1
fi

input_path="$1"
shift
cp_elements=("$@")

if [ -d "$input_path" ]; then
  mode="directory"
  echo "Operating in directory mode. Recursively processing .java files in $input_path"
  mapfile -t java_files < <(find "$input_path" -type f -name "*.java")
  if [ "${#java_files[@]}" -eq 0 ]; then
    echo "No .java files found in directory $input_path"
    exit 1
  fi
else
  mode="single"
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

# ---------------------------
# 3a. Alte Klassen im coverage-report Projekt löschen (ausgenommen Verifier.java)
# ---------------------------
COVERAGE_MAIN_DIR="coverage-report/src/main/java"
if [ -d "$COVERAGE_MAIN_DIR" ]; then
  echo "Clearing old Java classes from coverage-report project at $COVERAGE_MAIN_DIR (excluding tools/aqua/concolic/Verifier.java)..."
  find "$COVERAGE_MAIN_DIR" -type f -name "*.java" ! -path "*/tools/aqua/concolic/Verifier.java" -exec rm -f {} \;
else
  mkdir -p "$COVERAGE_MAIN_DIR"
fi

COVERAGE_TEST_DIR="coverage-report/src/test/java"
if [ -d "$COVERAGE_TEST_DIR" ]; then
  echo "Clearing old Java classes from coverage-report project at $COVERAGE_TEST_DIR (excluding tools/aqua/concolic/Verifier.java)..."
  find "$COVERAGE_TEST_DIR" -type f -name "*.java" ! -path "*/tools/aqua/concolic/Verifier.java" -exec rm -f {} \;
else
  mkdir -p "$COVERAGE_TEST_DIR"
fi

# ---------------------------
# 3b. Sicherstellen, dass die Verifier.java vorhanden ist
# ---------------------------
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
copy_verifier

# ---------------------------
# 4. Verarbeitung der Java-Dateien
# ---------------------------
# Arrays zur Ergebniszusammenfassung
declare -a successes
declare -a failures

EXEC_SUMMARY="$RESULTS_DIR/execution_summary.txt"
echo "Execution Summary - $(date)" > "$EXEC_SUMMARY"
echo "-------------------------------------------" >> "$EXEC_SUMMARY"

for file in "${java_files[@]}"; do
  mainclass=$(basename "$file" .java)
  echo "=========================================="
  echo "Processing class: $mainclass"
  echo "Source file: $file"
  echo "=========================================="
  
  tmpdir=$(mktemp -d)
  if [ ! -d "$tmpdir" ]; then
    echo "Failed to create temporary directory for $mainclass. Skipping."
    failures+=("$mainclass (tmpdir creation failed)")
    continue
  fi

  classpath="$tmpdir"
  mainjava="$tmpdir/${mainclass}.java"
  cp "$file" "$mainjava" || { 
      echo "Failed to copy $file to $mainjava. Skipping." 
      failures+=("$mainclass (copy failed)") 
      rm -rf "$tmpdir"
      continue
  }
  echo "Copied $file to $mainjava"

  for cp_element in "${cp_elements[@]}"; do
      if [ -d "$cp_element" ]; then
          cp -a "$cp_element"/* "$tmpdir/" 2>/dev/null
      else
          classpath="$classpath:$cp_element"
      fi
  done

  if [[ "$OSTYPE" == "darwin"* ]]; then
      find "$classpath" -name "*.java" -exec sed -i "" -e "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;
  else
      find "$classpath" -name "*.java" -exec sed -i "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;
  fi

  classpath="$classpath:$OFFSET/verifier-stub/target/verifier-stub-1.0.jar"

  JAVAC_FULL="$OFFSET/$JAVAC"
  JAVA_FULL="$OFFSET/$SPOUT"

  echo "Compiling $mainjava with classpath: $classpath"
  "$JAVAC_FULL" -cp "$classpath" "$mainjava"
  compile_exit=$?
  if [ $compile_exit -ne 0 ]; then
      echo "Compilation failed for $mainclass"
      failures+=("$mainclass (compilation failed)")
      rm -rf "$tmpdir"
      continue
  fi

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

  echo "Running DSE for class $mainclass..."
  dse_log="$RESULTS_DIR/_gdart_${mainclass}.log"
  dse_err="$RESULTS_DIR/_gdart_${mainclass}.err"
  
  "$JAVA_FULL" -cp "$OFFSET/dse/target/dse-0.0.1-SNAPSHOT-jar-with-dependencies.jar" \
      tools.aqua.dse.DSELauncher \
      $SOLVER_FLAGS \
      -Dproject.root="$OFFSET" \
      -Ddse.executor="$OFFSET/executor.sh" \
      -Ddse.executor.args="-cp $classpath $DSE $TAINT $mainclass" \
      -Ddse.sources="$classpath" > "$dse_log" 2> "$dse_err"
  dse_exit=$?
  
  echo "----- DSE Log for $mainclass -----"
  cat "$dse_log"
  echo "----- DSE Errors for $mainclass -----"
  cat "$dse_err"
  
  {
    echo "Class: $mainclass"
    echo "  Compilation: succeeded"
  } >> "$EXEC_SUMMARY"
  
  if [ $dse_exit -ne 0 ]; then
      echo "DSE execution failed for $mainclass. Removing its copy from coverage-report."
      rm -f "$DEST_DIR/${mainclass}.java"
      failures+=("$mainclass (DSE execution failed)")
  else
      echo "DSE execution succeeded for $mainclass."
      successes+=("$mainclass")
  fi

  rm -rf "$tmpdir"
  echo "------------------------------------------"
done

# ---------------------------
# 5. Maven-Tests und JaCoCo-Report
# ---------------------------
TESTS_DIR="coverage-report/src/test/java"
echo "Generated test classes in $TESTS_DIR:"
ls -lah "$TESTS_DIR"

POM_PATH="coverage-report/pom.xml"
if [ ! -f "$POM_PATH" ]; then
  echo "POM file $POM_PATH does not exist. Exiting..."
  exit 1
fi

echo "Running Maven tests..."
mvn clean test -f "$POM_PATH"

if [[ "$SOLVER_FLAGS" == *"dse.coveragereport=true"* ]]; then
  echo "Generating JaCoCo coverage report..."
  mvn jacoco:report -f "$POM_PATH"
fi

{
  echo ""
  echo "Execution Summary:"
  cat "$EXEC_SUMMARY"
} >> "$PARAMS_FILE"

# ---------------------------
# Copy the entire JaCoCo report directory to the run results.
# ---------------------------
REPORT_DIR="coverage-report/target/site/jacoco"
if [ -d "$REPORT_DIR" ]; then
  cp -r "$REPORT_DIR" "$RESULTS_DIR/"
  echo "JaCoCo coverage report copied to $RESULTS_DIR/jacoco."
else
  echo "JaCoCo coverage report not found at $REPORT_DIR"
fi

# ---------------------------
# 6. Abschließende Zusammenfassung
# ---------------------------
echo "===== Summary ====="
echo "Succeeded classes:"
for s in "${successes[@]}"; do
  echo "  - $s"
done

echo "Failed classes:"
for f in "${failures[@]}"; do
  echo "  - $f"
done

echo "Detailed execution summary is available at: $EXEC_SUMMARY"
echo "Parameters and run info are stored in: $PARAMS_FILE"

# Open the JaCoCo coverage report in a browser (if it exists).
if [ -f "$RESULTS_DIR/jacoco/index.html" ]; then
  echo "Opening JaCoCo coverage report..."
  win_report_path=$(wslpath -w "$RESULTS_DIR/jacoco/index.html")
  explorer.exe "$win_report_path"
fi
