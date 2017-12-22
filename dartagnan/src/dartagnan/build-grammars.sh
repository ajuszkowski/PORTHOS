#!/usr/bin/env bash

ANTLR_JAR=`pwd`"/../../import/antlr-4.7-complete.jar"
BASE_DIR=`pwd`/"languages"
OUTPUT_DIR=$BASE_DIR/"generated"
GRAMMARS_DIR=$BASE_DIR/"grammars"
OUTPUT_PACKAGE="dartagnan.languages.generated"

current_dir=`pwd`
cd $GRAMMARS_DIR
for g in *.g4; do
    command="java -jar $ANTLR_JAR $g -visitor -listener -package $OUTPUT_PACKAGE -o $OUTPUT_DIR"
    echo "Running $command..."
    eval $command
done
cd $current_dir
echo "OK"
