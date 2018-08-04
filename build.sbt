addCommandAlias("namaste", "~test-only org.functionalkoans.forscala.Koans")

name := "Scala Koans"

version := "1.0"

scalaVersion := "2.12.5"

traceLevel := -1

logLevel := Level.Info

// disable printing timing information, but still print [success]
showTiming := false

// disable printing a message indicating the success or failure of running a task
showSuccess := false

// append -deprecation to the options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

// disable updating dynamic revisions (including -SNAPSHOT versions)
offline := true

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "3.0.5" % "test" withSources() withJavadoc()
)
