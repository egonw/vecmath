def ant = new AntBuilder()

ant.mkdir(dir:"bin")
ant.javac(
  srcdir:"javax", destdir:"bin",
  includes:"**/*.java",
  fork:"true") {
  classpath {
    fileset dir: ".", {
      include name: "*.jar"
    }
  }
}

ant.jar(
  destfile:"vecmath1.2-1.15.jar",
  basedir:"bin",
  includes:"**/*.class"
)

