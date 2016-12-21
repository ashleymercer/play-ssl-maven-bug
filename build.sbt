scalaVersion := "2.11.7"

name := "play-ssl-layout-bug"
version := "1.0"

lazy val `play-ssl-layout-bug` = (project in file("."))
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLayoutPlugin)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  
