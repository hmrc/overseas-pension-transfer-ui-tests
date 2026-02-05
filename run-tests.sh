
BROWSER=${1:-chrome}
JOURNEY=${2:-OAOTC}

echo "Running browser tests..."
echo "=========================================="
echo "Browser:              ${BROWSER}"
echo "Env:                  local"
echo "Journey:              ${JOURNEY}"
echo "=========================================="

sbt clean -Dbrowser="${BROWSER}" -Dbrowser.option.headless=true -Denvironment=local "testOnly specs.* -- -n AllTests" testReport

#sbt -jvm-debug 5005 clean -Dbrowser="${BROWSER}" -Dbrowser.option.headless=true -Denvironment=local "testOnly specs.* -- -n AllTests" testReport

#sbt clean -Dbrowser="${BROWSER_TYPE:=$DEFAULT_BROWSER}" -Daccessibility.timeout=7500.millis -Denvironment="${ENV:=local}" "testOnly uk.gov.hmrc.otc.cucumber.runner.Runner" testReport