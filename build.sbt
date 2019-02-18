name := "gatling-mqtt"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "io.gatling" % "gatling-core" % "3.0.3" % "provided",
  "org.fusesource.mqtt-client" % "mqtt-client" % "1.14"
)

// Gatling contains scala-library
assemblyOption in assembly := (assemblyOption in assembly).value
  .copy(includeScala = false)
