import sbt._
import Keys._

object BuildSettings {
  val buildOrganization = "com.pongr"
  val buildVersion      = "1.0"
  val buildScalaVersion = "2.9.1"

  val buildSettings = Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion
  )
}

object Version {
  val specs2 = "1.8"
}

object Dependencies {
  val specs2 = "org.specs2" %% "specs2" % Version.specs2 % "test"
}

object Hello3Build extends Build {
  import BuildSettings._
  import Dependencies._
  
  override lazy val settings = super.settings ++ buildSettings
  
  lazy val hello3 = Project (
    id = "hello3",
    base = file("."),
    settings = 
      Project.defaultSettings ++ 
      Seq (
        libraryDependencies += specs2
      )
  )
}
