#!/bin/bash

# Copyright (C) 2023, Automated Quality Assurance Group,
# TU Dortmund University, Germany. All rights reserved.
#
# gdart.sh is licensed under the Apache License,
# Version 2.0 (the "License"); you may not use this file except in compliance
# with the License. You may obtain a copy of the License at
# http://www.apache.org/licenses/LICENSE-2.0.
#
# Unless required by applicable law or agreed to in writing, software distributed
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
# CONDITIONS OF ANY KIND, either express or implied. See the License for the
# specific language governing permissions and limitations under the License.

OFFSET=$(dirname $BASH_SOURCE)
if [[ -z "$OFFSET" ]]; then
    OFFSET="."
fi

source $OFFSET/config

SPOUT="$GRAALVM_HOME/java"
JAVAC="$GRAALVM_HOME/javac"

DSE="-Dconcolic.execution=false -Ddse.coveragereport=true"
TAINT="-Dtaint.flow=OFF"
SOLVER="-Ddse.dp=cvc5"
SOLVER_FLAGS="-Ddse.witness=true -Ddse.b64encode=true -Ddse.bounds=true -Ddse.bounds.iter=6 -Ddse.bounds.step=6 -Ddse.eplore=BFS -Ddse.b64encode=true -Djconstraints.multi=disableUnsatCoreChecking=true" 

function usage() {
  echo "usage: $OFFSET/gdart.sh [-d] [-t TA] [-s solver] [options] mainclass cp-element cp-element ..." 
  echo ""
  echo "  -d|--dse                              enable dynamic symbolic execution" 
  echo "  -t|--taint [DATA|CONTROL|INFORMATION] enable taint analysis"
  echo "  -s|-solver [z3|cvc5|multi]            jconstraints id of solving backend (default: z3)"
  echo "  -o|--option name=value                for the following options:" 
  echo ""
  echo "    dse.explore           one of: inorder, bfs, dfs (default)"
  echo "    dse.terminate.on      | separated list of: assertion, error, bug, taint, completion (default)"
  echo "    dse.dp.incremental    use incremental solving: true / false (default)"
  echo "    dse.bounds            use bounds on integer values when solving: true / false (default)"
  echo "    dse.bounds.step       step width (increase of bounds) when using bounds iteratively"
  echo "    dse.bounds.iter       no. of bounded solving attempts before dropping bounds"
  echo "    dse.bounds.type       fibonacci: uses fibonacci seq. from index 2 (1, 2, 3, 5, ...) as steps"
  echo "    jconstraints.multi=disableUnsatCoreChecking=[true|false]"
  echo "    dse.coveragereport    generate coverage report: true / false (default)"
  echo ""
}

SOLVER_FLAGS="$SOLVER_FLAGS $SOLVER" 

# tmpdir=$(mktemp -d)
tmpdir="$OFFSET/tmp"
mkdir -p "$tmpdir"
classpath=$tmpdir
mainclass=$1
mainjava=$tmpdir/$1.java
shift

for cpelement in $@; do
  if [[ -d $cpelement ]]; then
    cp -a $cpelement/* $tmpdir/
  else
    classpath="$classpath:$cpelement"
  fi
done

if [[ "$OSTYPE" == "darwin"* ]]; then
  find $classpath -name "*.java" -exec sed -i "" -e "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;;
else
  find $classpath -name "*.java" -exec sed -i "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;;
fi

classpath="$classpath:$OFFSET/verifier-stub/target/verifier-stub-1.0.jar"

if [[ ! -f $mainjava ]]; then
  echo "Could not find main class to execute program"
  exit 1
fi

JAVAC=$OFFSET/$JAVAC
JAVA=$OFFSET/$SPOUT

echo "Env. Info ---------------------------------------------"
mpath=$(dirname $mainclass)
$JAVA -version
$JAVAC -version
ls -lah $mpath
echo ""
echo "Target ------------------------------------------------"
echo "computed classpath: $classpath"
echo "main class: $mainclass"
ls -lah $tmpdir
echo "-------------------------------------------------------"

echo "compiling: $JAVAC -cp $classpath $mainjava"
$JAVAC -cp $classpath $mainjava
if [[ $? -ne 0 ]]; then
  echo "Could not compile main class"
  exit 1
fi


echo "Solver Flags: $SOLVER_FLAGS"
$JAVA -Dlog4j.configurationFile=$OFFSET/resources/log4j2.xml \
      -Dorg.apache.logging.log4j.simplelog.StatusLogger.level=TRACE \
      -cp $OFFSET/dse/target/dse-0.0.1-SNAPSHOT-jar-with-dependencies.jar tools.aqua.dse.DSELauncher \
      $SOLVER_FLAGS \
      -Ddse.executor=$OFFSET/executor.sh \
      -Ddse.executor.args="-cp $classpath $DSE $TAINT $mainclass" \
      -Ddse.sources=$classpath > _gdart.log 2> _gdart.err

# Ensure coverage directory exists
COVERAGE_DIR="$OFFSET/coverage-report"
mkdir -p "$COVERAGE_DIR"

echo "Checking contents of coverage report folder:"
find ./coverage-report/
find $OFFSET/tmp/

# Copy original and test classes to the new Maven project
RELEVANT_CLASSES_DIR="$COVERAGE_DIR/src/main/java"
mkdir -p "$RELEVANT_CLASSES_DIR"
cp $mainjava "$RELEVANT_CLASSES_DIR/"

# Maven build and test in the new project
POM_PATH="$COVERAGE_DIR/pom.xml"
if [[ ! -f $POM_PATH ]]; then
  echo "POM file $POM_PATH does not exist. Exiting..."
  exit 1
fi

echo "Running Maven build and tests in the new project"
mvn clean test -f $POM_PATH

# Check if coverage report is enabled
if [[ "$SOLVER_FLAGS" == *"dse.coveragereport=true"* ]]; then
  echo "Generating JaCoCo coverage report"
  mvn jacoco:report -f $POM_PATH
fi

# Eventually, we print non-readable characters from the SMT solver to the log.
sed 's/[^[:print:]]//' _gdart.log > _gdart.processed
mv _gdart.processed _gdart.log

echo "# # # # # # #"

cat _gdart.log

echo "# # # # # # #"

cat _gdart.err

echo "# # # # # # #"

complete=$(cat _gdart.log | grep -a "END OF OUTPUT")
if [[ $complete = "" ]]; then 
  complete="no" 
else 
  complete="yes" 
fi

errors=$(cat _gdart.log | grep -a ERROR | grep -a java.lang.AssertionError | cut -d '.' -f 3 | wc -l | tr -s '[:blank:]')
buggy=$(cat _gdart.log | grep -a BUGGY | cut -d '.' -f 2 | wc -l | tr -s '[:blank:]')
diverged=$(cat _gdart.log | grep -a DIVERGED | cut -d '.' -f 2 | wc -l | tr -s '[:blank:]')
skipped=$(cat _gdart.log | grep -a SKIPPED | egrep -v "assumption violation" | cut -d '.' -f 3 | wc -l | tr -s '[:blank:]')
taint=$(cat _gdart.log | grep -a "TAINT VIOLATION" | egrep -v "assumption violation" | cut -d '.' -f 3 | wc -l | tr -s '[:blank:]')

echo "analysis completed: $complete"

printf 'errors (assertions/exceptions):   %4s\n' $errors
printf 'taint discovered (data/control):  %4s\n' $taint
printf 'crashes in concolic executor:     %4s\n' $buggy
printf 'unexpected paths for models:      %4s\n' $diverged
printf 'skipped (assumptions/unsupported):%4s\n' $skipped

echo "Coverage report generated at $COVERAGE_DIR/target/site/jacoco"

rm -rf $tmpdir 
rm _gdart.log
rm _gdart.err
