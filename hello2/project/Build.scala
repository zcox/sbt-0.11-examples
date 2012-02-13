import sbt._
import Keys._

object Hello2Build extends Build {
  
  override lazy val settings: Seq[Project.Setting[_]] = 
    super.settings ++
    Seq (
      organization := "com.pongr",
      name := "hello2",
      version := "1.0-SNAPSHOT",
      scalaVersion := "2.9.1"
    )
  
  lazy val hello2 = Project (
    id = "hello2",
    base = file("."),
    settings = 
      Project.defaultSettings ++ 
      Seq (
        libraryDependencies += "org.specs2" %% "specs2" % "1.8" % "test"
      )
  )
}
