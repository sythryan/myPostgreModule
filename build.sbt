name := "DatabaseExperimenting"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.squeryl" %% "squeryl" % "0.9.5-6",
  "postgresql" % "postgresql" % "8.4-701.jdbc4"
)
