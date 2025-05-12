import sbt.Credentials
import sbt.Keys.credentials

val scala3Version = "3.3.1"

// sbt-github-actions defaults to using JDK 8 for testing and publishing.
// The following adds JDK 17 for testing.
ThisBuild / githubWorkflowJavaVersions += JavaSpec.temurin("17")

val myGithubOwner = "brambg"
val myGithubRepository = "example-scala-library"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "nl.scala.example",
    name := myGithubRepository,
    version := "1.0.2",
    versionScheme := Some("early-semver"),
    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.19" % "test"
    ),

    githubOwner := myGithubOwner,
    githubRepository := myGithubRepository,
    publishTo := Some(s"GitHub $myGithubOwner Apache Maven Packages" at s"https://maven.pkg.github.com/$myGithubOwner/$myGithubRepository"),
    publishMavenStyle := true,
    publishConfiguration := publishConfiguration.value.withOverwrite(true),

    credentials += Credentials(
      "GitHub Package Registry",
      "maven.pkg.github.com",
      myGithubOwner,
      System.getenv("GITHUB_TOKEN")
    )

  )