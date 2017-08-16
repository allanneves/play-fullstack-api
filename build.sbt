name := """play-java-seed"""
organization := "com.allan.playdocker"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
libraryDependencies += "com.adrianhurt" %% "play-bootstrap" % "1.2-P26-B3"