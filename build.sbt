lazy val testSuite = (project in file("."))
  .disablePlugins(JUnitXmlReportPlugin) // Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .settings(
    name := "overseas-pension-transfer-ui-tests",
    version := "0.1.0",
    scalaVersion := "2.13.13",
    libraryDependencies ++= Dependencies.test,
    // The testOptions from SbtAutoBuildPlugin supports only ScalaTest. Resetting testOptions for Cucumber Tests.
    Test / testOptions := Seq.empty
  )
