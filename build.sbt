name := "ExampleWorkflow"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.effektif" % "effektif-workflow-impl" % "3.0.0-beta5",
  "com.effektif" % "effektif-workflow-api" % "3.0.0-beta5",
  "com.typesafe" % "config" % "1.2.1"
)