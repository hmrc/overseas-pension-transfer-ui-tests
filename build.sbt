lazy val root = (project in file("."))
  .settings(
    name := "overseas-pension-transfer-ui-tests",
    version := "0.1.0",
    scalaVersion := "2.13.13",
    libraryDependencies ++= Dependencies.test,
  )
