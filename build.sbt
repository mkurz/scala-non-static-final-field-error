lazy val root = Project("scala-non-static-final-field-error", file("."))
  .enablePlugins(PlayWeb)
  .disablePlugins(PlayLayoutPlugin, PlayFilters)
  .settings(
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice
    ),
    scalacOptions in (Compile, compile) ++= Seq("-target:11"), // setting target is essential to reproduce the issue
  )
