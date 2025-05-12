import sbt.Credentials
import sbt.Keys.credentials

val scala3Version = "3.3.1"

// sbt-github-actions defaults to using JDK 8 for testing and publishing.
// The following adds JDK 17 for testing.
ThisBuild / githubWorkflowJavaVersions += JavaSpec.temurin("17")

val _githubOwner = "brambg"
val _githubRepository = "example-scala-library"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "nl.scala.example",
    name := _githubRepository,
    version := "1.0.0",
    versionScheme := Some("early-semver"),
    scalaVersion := scala3Version,

    githubOwner := _githubOwner,
    githubRepository := _githubRepository,
    publishTo := Some(s"GitHub $_githubOwner Apache Maven Packages" at s"https://maven.pkg.github.com/$_githubOwner/$_githubRepository"),
    publishMavenStyle := true,

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.19" % "test"
    ),

    credentials += Credentials(
      "GitHub Package Registry",
      "maven.pkg.github.com",
      _githubOwner,
      System.getenv("GITHUB_TOKEN")
    )

  )