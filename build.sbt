lazy val root = (project in file(".")).settings(sharedSettings)

lazy val sharedSettings = Seq(
  scalaVersion := "2.12.11",
  scalacOptions := Seq(
    "-deprecation"
  )
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.2" % "test",
  "org.mockito" %% "mockito-scala-scalatest" % "1.14.3" % "test",
)
