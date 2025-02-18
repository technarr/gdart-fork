#!/bin/bash

# Set OFFSET to the directory containing this script.
OFFSET=$(dirname "$BASH_SOURCE")
if [ -z "$OFFSET" ]; then
  OFFSET="."
fi

# Change directory to OFFSET (so that relative paths resolve as expected).
cd "$OFFSET" || { echo "Failed to change directory to $OFFSET"; exit 1; }

# Load configuration if available.
[ -f "./config" ] && source "./config"

SPOUT="$GRAALVM_HOME/java"
JAVAC="$GRAALVM_HOME/javac"

# DSE="-Dconcolic.execution=true -Ddse.witness=false -Ddse.b64encode=true"
# TAINT="-Dtaint.flow=OFF"
# SOLVER="-Ddse.dp=cvc5"
# SOLVER_FLAGS="-Ddse.witness=true -Ddse.b64encode=true -Ddse.dp.incremental=true -Ddse.coveragereport=true"
# SOLVER_FLAGS="$SOLVER_FLAGS $SOLVER"

# Flags von Gdart-SVComp
SOLVER_FLAGS="-Ddse.witness=true -Ddse.dp=cvc5 -Ddse.bounds=true -Ddse.bounds.iter=6 -Ddse.bounds.step=6 -Ddse.explore=BFS -Ddse.b64encode=true -Ddse.coveragereport=true -Djconstraints.multi=disableUnsatCoreChecking=true -Dtaint.flow=OFF"



# Create a unique temporary directory.
tmpdir=$(mktemp -d)
if [ ! -d "$tmpdir" ]; then
  echo "Failed to create temporary directory."
  exit 1
fi
classpath="$tmpdir"

# Get the main class input (e.g., "examples/Example5")
mainclass_input="$1"
if [ -z "$mainclass_input" ]; then
  echo "Usage: $0 <main-class-path> [cp-element ...]"
  rm -rf "$tmpdir"
  exit 1
fi
mainclass=$(basename "$mainclass_input")
shift
mainjava="$tmpdir/${mainclass}.java"

if [ ! -f "$mainjava" ]; then
  if [ -f "$OFFSET/$mainclass_input.java" ]; then
    cp "$OFFSET/$mainclass_input.java" "$mainjava"
    echo "Copied $OFFSET/$mainclass_input.java to $mainjava"
  else
    echo "Could not find main class source file."
    rm -rf "$tmpdir"
    exit 1
  fi
fi

# Process any remaining arguments (directories or classpath elements).
for cp_element in "$@"; do
  if [ -d "$cp_element" ]; then
    cp -a "$cp_element"/* "$tmpdir/"
  else
    classpath="$classpath:$cp_element"
  fi
done

if [[ "$OSTYPE" == "darwin"* ]]; then
  find $classpath -name "*.java" -exec sed -i "" -e "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;;
else
  find $classpath -name "*.java" -exec sed -i "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;;
fi

# Append the verifier stub JAR.
classpath="$classpath:$OFFSET/verifier-stub/target/verifier-stub-1.0.jar"

JAVAC="$OFFSET/$JAVAC"
JAVA="$OFFSET/$SPOUT"

echo "Env. Info ---------------------------------------------"
$JAVA -version
$JAVAC -version
echo "Classpath: $classpath"
echo "Main class: $mainclass"
echo "Temporary directory contents:"
ls -lah "$tmpdir"
echo "-------------------------------------------------------"

echo "Compiling: $JAVAC -cp $classpath $mainjava"
$JAVAC -cp "$classpath" "$mainjava"
if [ $? -ne 0 ]; then
  echo "Compilation failed."
  rm -rf "$tmpdir"
  exit 1
fi

DEST_DIR="coverage-report/src/main/java"
mkdir -p "$DEST_DIR"
# Define paths
VERIFIER_SRC="verifier-stub/src/main/java/tools/aqua/concolic/Verifier.java"
VERIFIER_DEST="coverage-report/src/main/java/tools/aqua/concolic/Verifier.java"
VERIFIER_DEST_DIR="coverage-report/src/main/java/tools/aqua/concolic"

# Ensure the directory exists
mkdir -p "$VERIFIER_DEST_DIR"

# Copy Verifier.java if not present
if [ ! -f "$VERIFIER_DEST" ]; then
    echo "Copying Verifier.java to coverage-report..."
    cp "$VERIFIER_SRC" "$VERIFIER_DEST"
    if [ $? -eq 0 ]; then
        echo "Successfully copied Verifier.java"
    else
        echo "ERROR: Failed to copy Verifier.java"
        exit 1
    fi
else
    echo "Verifier.java already exists. Skipping copy."
fi

echo "DEBUG: Copying $mainjava to $DEST_DIR/"
cp "$mainjava" "$DEST_DIR/"
if [ $? -eq 0 ]; then
    echo "Successfully copied $mainjava to $DEST_DIR/"
else
    echo "ERROR: Failed to copy $mainjava to $DEST_DIR/"
fi
ls -lah coverage-report/src/main/java

# Now, pass -Dproject.root=$OFFSET to DSELauncher.
echo "Running the Java application..."
$JAVA -cp "$OFFSET/dse/target/dse-0.0.1-SNAPSHOT-jar-with-dependencies.jar" \
  tools.aqua.dse.DSELauncher \
  $SOLVER_FLAGS \
  -Dproject.root="$OFFSET" \
  -Ddse.executor="$OFFSET/executor.sh" \
  -Ddse.executor.args="-cp $classpath $DSE $TAINT $mainclass" \
  -Ddse.sources="$classpath" > _gdart.log 2> _gdart.err

# $JAVA -cp "$OFFSET/dse/target/dse-0.0.1-SNAPSHOT-jar-with-dependencies.jar" \
#   tools.aqua.dse.DSELauncher \
#   $SOLVER_FLAGS \
#   -Dproject.root="$OFFSET" \
#   -Ddse.executor="$OFFSET/executor.sh" \
#   -Ddse.executor.args="-cp $classpath $mainclass" \
#   -Ddse.sources="$classpath" > _gdart.log 2> _gdart.err

# Gdart-svcomp:
# $JAVA -cp $OFFSET/dse/target/dse-0.0.1-SNAPSHOT-jar-with-dependencies.jar \ 
# tools.aqua.dse.DSELauncher \
# $SOLVER_FLAGS \ 
# -Ddse.executor=$OFFSET/executor.sh \
#  -Ddse.executor.args="-cp $classpath Main" -Ddse.sources=$classpath > _gdart.log 2> _gdart.err


TESTS_DIR="coverage-report/src/test/java"
echo "Generated test classes in $TESTS_DIR:"
ls -lah "$TESTS_DIR"

# Continue with Maven tests...
POM_PATH="coverage-report/pom.xml"
if [ ! -f "$POM_PATH" ]; then
  echo "POM file $POM_PATH does not exist. Exiting..."
  rm -rf "$tmpdir"
  exit 1
fi

echo "Running Maven tests..."
mvn clean test -f "$POM_PATH"

if [[ "$SOLVER_FLAGS" == *"dse.coveragereport=true"* ]]; then
  echo "Generating JaCoCo coverage report..."
  mvn jacoco:report -f "$POM_PATH"
fi

sed 's/[^[:print:]]//' _gdart.log > _gdart.processed
mv _gdart.processed _gdart.log

echo "----- DSE Log -----"
cat _gdart.log
echo "----- DSE Errors -----"
cat _gdart.err

rm -rf "$tmpdir" _gdart.log _gdart.err
