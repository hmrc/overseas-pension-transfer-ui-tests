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

sbt clean -Dbrowser="chrome" -Denvironment="local" -Dbrowser.option.headless=true -Daccessibility.timeout="1000" "testOnly specs.endToEnd.*" testReport

#sbt clean -Dbrowser="${BROWSER_TYPE:=$DEFAULT_BROWSER}" -Daccessibility.timeout=7500.millis -Denvironment="${ENV:=local}" "testOnly uk.gov.hmrc.otc.cucumber.runner.Runner" testReport