sbtPlugin := true

organization := "io.teamscala.sbt"

name := "sbt-play-webpack"

scalaVersion := "2.10.6"

resolvers ++= Seq(
  Resolver.typesafeRepo("releases"),
  Resolver.jcenterRepo
)

libraryDependencies += "org.webjars.npm" % "lodash" % "4.14.1"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % sys.props.getOrElse("play.version", "2.5.4"))

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
