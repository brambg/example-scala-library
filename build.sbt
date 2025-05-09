val scala3Version = "3.3.1"

// sbt-github-actions defaults to using JDK 8 for testing and publishing.
// The following adds JDK 17 for testing.
ThisBuild / githubWorkflowJavaVersions += JavaSpec.temurin("17")

lazy val root = project
  .in(file("."))
  .settings(
    organization := "nl.scala.example",
    name := "example-scala-library",
    version := "1.0.0",
    versionScheme := Some("early-semver"),
    scalaVersion := scala3Version,
    publishTo := Some(MavenCache("local-maven", file("/Users/bram/.m2/repository"))),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.19" % "test"
    ),
    githubOwner := "brambg",
    githubRepository := "example-scala-library"
  )