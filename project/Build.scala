import sbt._
import PlayProject._
import sbt.Keys._

object ApplicationBuild extends Build {

  val appVersion = "1.0-SNAPSHOT"

  val scalaTest = "org.scalatest" %% "scalatest" % "1.8" % "test"

  val appDependencies = Seq(
    scalaTest
  )

  val main = PlayProject("catch-phrase", appVersion, appDependencies, mainLang = SCALA).settings(
    testOptions in Test := Nil
  )

}
