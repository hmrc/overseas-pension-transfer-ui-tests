#!/bin/bash -e
DEFAULT_BROWSER=chrome
BROWSER_TYPE=$1
ENV=$2

if [ -z "$BROWSER_TYPE" ]
then
    echo "BROWSER_TYPE value not set, defaulting to $DEFAULT_BROWSER..."
else
    echo "BROWSER_TYPE value set to $BROWSER_TYPE..."
fi

sbt clean -Dbrowser="${BROWSER_TYPE:=$DEFAULT_BROWSER}" -Denvironment="${ENV:=local}" test testReport