name := "restcow"

version := "0.1"

libraryDependencies ++= Seq(
  "com.sparkjava" % "spark-core" % "2.1",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.7.4",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.4",
  "com.github.ricksbrown" % "cowsay" % "1.0.1"
)

mainClass in (Compile, run) := Some("org.elwaxoro.restcow.Application")
