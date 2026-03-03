lazy val testSuite = (project in file("."))
  .disablePlugins(JUnitXmlReportPlugin) // Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .settings(
    name := "overseas-pension-transfer-ui-tests",
    version := "0.1.0",
    scalaVersion := "3.5.2",
    libraryDependencies ++= Dependencies.test,
  )
