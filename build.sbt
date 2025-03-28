val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "nl.brambg",
    name := "example-scala-library",
    version := "0.1.0-SNAPSHOT",
    versionScheme := Some("early-semver"),
    scalaVersion := scala3Version,
    publishTo := Some(MavenCache("local-maven", file("/Users/bram/.m2/repository"))),

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.19" % "test"
    )
  )
