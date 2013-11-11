import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

name := "hello"

version := "1.0"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
	"org.cddcore" %% "website" % "1.7.1",
	"org.cddcore" %% "legacy" % "1.7.1",
	)