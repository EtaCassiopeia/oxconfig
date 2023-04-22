import Dependencies._

ThisBuild / scalaVersion     := "2.13.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "dev.celestica"

lazy val root = (project in file("."))
  .settings(
    name := "OxConfig",
    libraryDependencies += munit % Test
  )
