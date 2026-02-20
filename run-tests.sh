
#!/usr/bin/env bash

BROWSER=${1:-chrome}
JOURNEY=${2:-OAOTC}

echo "Running browser tests..."
echo "=========================================="
echo "Browser:              ${BROWSER}"
echo "Env:                  local"
echo "Journey:              ${JOURNEY}"
echo "=========================================="

sbt clean -Dbrowser="${BROWSER}" -Dbrowser.option.headless=true -Denvironment=local "testOnly specs.* -- -n AllTests" testReport
