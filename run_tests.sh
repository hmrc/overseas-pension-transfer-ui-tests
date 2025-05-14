#!/usr/bin/env bash

BROWSER=${1:-chrome}
JOURNEY=${2:-Overseas Pension Transfer UI Tests}

echo "Running browser tests..."
echo "=========================================="
echo "Browser:              ${BROWSER}"
echo "Env:                  local"
echo "Journey:              ${JOURNEY}"
echo "=========================================="
sbt clean -Dbrowser="${BROWSER}" -Dbrowser.option.headless=false -Denvironment=local "testOnly uk.gov.hmrc.otc.cucumber.runner.Runner" testReport
