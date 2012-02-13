import sbt._
import Keys._

object Hello1Build extends Build {
  
  lazy val hello1 = Project (
    id = "hello1",
    base = file(".")
  )
  
}
