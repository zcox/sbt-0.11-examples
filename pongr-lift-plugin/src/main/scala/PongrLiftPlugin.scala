import sbt._

object PongrLiftPlugin extends Plugin {
  val liftDbFile = SettingKey[String]("lift-db-file", "The db file to remove")
  val liftRmDb = TaskKey[Unit]("lift-rm-db", "Removes the db file")
  
  val pongrLiftSettings = Seq (
    liftDbFile := "lift_proto.db.h2.db",
    liftRmDb <<= liftDbFile map { db => println("TODO: Should remove %s..." format db) }
  ) 
}
