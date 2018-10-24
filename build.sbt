organization := "edu.berkeley.cs"

version := "1.2-102318-SNAPSHOT"

name := "hardfloat"

scalaVersion := "2.12.4"

// Provide a managed dependency on chisel if -DchiselVersion="" issupplied on the command line.
libraryDependencies ++= (Seq("chisel").map {
  dep: String => sys.props.get(dep + "Version") map { "edu.berkeley.cs" %% dep % _ }}).flatten
