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

OFFSET=$(dirname $BASH_SOURCE[0])
# SOLVER_FLAGS="-Ddse.witness=false -Ddse.dp=z3  -Ddse.b64encode=true -Ddse.coveragereport=true"
SOLVER_FLAGS="-Ddse.witness=true -Ddse.dp=cvc5 -Ddse.bounds=true -Ddse.bounds.iter=6 -Ddse.bounds.step=6 -Ddse.eplore=BFS -Ddse.b64encode=true -Djconstraints.multi=disableUnsatCoreChecking=true -Dtaint.flow=OFF -Ddse.coveragereport=true"
if [[ -z "$OFFSET" ]]; then
    OFFSET="."
fi

sha=$(cat ${OFFSET}/version.txt)

property=$1
  
if [ "$property" == "-v" ]; then
  echo "gdart-0.1-$sha"
  exit
fi

ASSERTION=$(cat $property | grep assert)
EXCEPTION=$(cat $property | grep RuntimeException)

if [[ -z $ASSERTION ]] && [[ -z $EXCEPTION ]]; then
    echo "Unknown property, cannot analyze this!"
    exit 127
fi

if [[ ! -z $ASSERTION ]]; then
      echo "Adding assumption flag"
    SOLVER_FLAGS+=" -Ddse.terminate.on=assertion"
fi

if [[ ! -z $EXCEPTION ]]; then
    echo "Adding error flag"
    SOLVER_FLAGS+=" -Ddse.terminate.on=error"
fi

path=`pwd`

shift
# classpath=$OFFSET
tmpdir=$(mktemp -d)
classpath=$tmpdir

mainclass=""
for folder in $@; do
  cp -a $folder/* $classpath/
done
cp -a $OFFSET/verifier-stub/target/verifier-stub-1.0.jar $classpath/

if [[ -n $(find $classpath |grep Main.java) ]]; then
  mainclass=$(find $classpath |grep Main.java)
fi
echo $classpath
if [[ "$OSTYPE" == "darwin"* ]]; then
  find $classpath -name "*.java" -exec sed -i "" -e "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;;
else
  find $classpath -name "*.java" -exec sed -i "s/org\.sosy_lab\.sv_benchmarks\.Verifier/tools\.aqua\.concolic\.Verifier/g" {} \;;
fi

if [[ -z $mainclass ]]; then
  echo "Could not find main class to execute program"
  echo "== DONT-KNOW"
  exit 1
fi
classpath="$classpath:$classpath/verifier-stub-1.0.jar"
echo "computed classpath: $classpath"
echo "found main class: $mainclass"

if [[ "$OSTYPE" == "darwin"* ]]; then
    JAVAC=$OFFSET/SPouT/sdk/mxbuild/darwin-aarch64/GRAALVM_ESPRESSO_NATIVE_CE_JAVA17/graalvm-espresso-native-ce-java17-22.2.0.1-dev/Contents/Home/bin/javac
    JAVA=$OFFSET/SPouT/sdk/mxbuild/darwin-aarch64/GRAALVM_ESPRESSO_NATIVE_CE_JAVA17/graalvm-espresso-native-ce-java17-22.2.0.1-dev/Contents/Home/bin/java
else
    if [[ "$(uname -m)" == "aarch64" ]]; then
        JAVAC=$OFFSET/SPouT/sdk/mxbuild/linux-aarch64/GRAALVM_ESPRESSO_NATIVE_CE_JAVA17/graalvm-espresso-native-ce-java17-22.2.0.1-dev/bin/javac
        JAVA=$OFFSET/SPouT/sdk/mxbuild/linux-aarch64/GRAALVM_ESPRESSO_NATIVE_CE_JAVA17/graalvm-espresso-native-ce-java17-22.2.0.1-dev/bin/java
    else 
        JAVAC=$OFFSET/SPouT/sdk/mxbuild/linux-amd64/GRAALVM_ESPRESSO_NATIVE_CE_JAVA17/graalvm-espresso-native-ce-java17-22.2.0.1-dev/bin/javac
        JAVA=$OFFSET/SPouT/sdk/mxbuild/linux-amd64/GRAALVM_ESPRESSO_NATIVE_CE_JAVA17/graalvm-espresso-native-ce-java17-22.2.0.1-dev/bin/java
    fi
fi

echo "Env. Info ---------------------------------------------"
mpath=$(dirname $mainclass)
$JAVA -version
$JAVAC -version
ls -lah $mpath
echo "-------------------------------------------------------"

echo "compiling: $JAVAC -cp $classpath $mainclass"
$JAVAC -cp $classpath $mainclass
if [[ $? -ne 0 ]]; then
  echo "Could not compile main class"
  echo "== DONT-KNOW"
  exit 1
fi

DSE="-Dconcolic.execution=true"
TAINT="-Dtaint.flow=OFF"

echo "Invoke DSE $JAVA -cp $OFFSET/dse/target/dse-0.0.1-SNAPSHOT-jar-with-dependencies.jar tools.aqua.dse.DSELauncher $SOLVER_FLAGS -Ddse.executor=$OFFSET/executor.sh -Ddse.executor.args="-cp $classpath $DSE $TAINT Main" -Ddse.sources=$classpath > _gdart.log 2> _gdart.err"
$JAVA -cp $OFFSET/dse/target/dse-0.0.1-SNAPSHOT-jar-with-dependencies.jar tools.aqua.dse.DSELauncher $SOLVER_FLAGS -Ddse.executor=$OFFSET/executor.sh -Ddse.executor.args="-cp $classpath $DSE $TAINT Main" -Ddse.sources=$classpath > _gdart.log 2> _gdart.err
# $JAVA -cp $OFFSET/dse/target/dse-0.0.1-SNAPSHOT-jar-with-dependencies.jar tools.aqua.dse.DSELauncher $SOLVER_FLAGS -Ddse.executor=$OFFSET/executor.sh -Ddse.executor.args="-cp $classpath Main" -Ddse.sources=$classpath > _gdart.log 2> _gdart.err

# Ensure coverage directory exists
COVERAGE_DIR="$OFFSET/coverage-report"
mkdir -p "$COVERAGE_DIR"

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

#Eventually, we print non readable character from the SMT solver to the log.
sed 's/[^[:print:]]//' _gdart.log > _gdart.processed
mv _gdart.processed _gdart.log
echo "# # # # # # #"
cat _gdart.log
echo "# # # # # # #"
cat _gdart.err
echo "# # # # # # #"
cat witness.graphml
echo "# # # # # # #"

complete=`cat _gdart.log | grep -a "END OF OUTPUT"`

if [[ ! -z $ASSERTION ]]; then 
errors=`cat _gdart.log | grep -a ERROR | grep -a java.lang.AssertionError | cut -d '.' -f 3`
fi

if [[ ! -z $EXCEPTION ]]; then 
errors=`cat _gdart.log | grep -a ERROR | grep -a Exception | cut -d '.' -f 3`
fi

buggy=`cat _gdart.log | grep -a BUGGY | cut -d '.' -f 2`
diverged=`cat _gdart.log | grep -a DIVERGED | cut -d '.' -f 2`
skipped=`cat _gdart.log | grep -a SKIPPED | egrep -v "assumption violation" | cut -d '.' -f 3`

echo "complete: $complete"
echo "err: $errors"
echo "buggy: $buggy"
echo "diverged: $diverged"
echo "skipped: $skipped"

if [[ -n "$errors" ]]; then
  echo "Errors:"
  echo "$errors"
  err=`echo $errors| wc -l`
fi


if [[ ! "$err" -eq "0" ]]; then
    echo "== ERROR"
else
    if [[ -z $buggy ]] && [[ -z $skipped ]] && [[ ! -z $complete ]] && [[ -z $diverged ]]; then
        echo "== OK"
    else
        echo "== DONT-KNOW"
    fi
fi

rm -rf $classpath #Delete the tmpdir
