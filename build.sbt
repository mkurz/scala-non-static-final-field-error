lazy val root = Project("scala-non-static-final-field-error", file("."))
  .enablePlugins(PlayWeb)
  .disablePlugins(PlayLayoutPlugin, PlayFilters)
  .settings(
    resolvers in Global += "scala-integration" at "https://scala-ci.typesafe.com/artifactory/scala-integration/",
    scalaVersion := "2.13.2-bin-8ee21e7",
    libraryDependencies ++= Seq(
      guice
    ),
    scalacOptions in (Compile, compile) ++= Seq("-target:11"), // setting target is essential to reproduce the issue
  )
