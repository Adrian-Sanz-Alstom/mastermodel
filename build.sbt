name := "mastermodel"
version := "1.0"
scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
"org.apache.spark" % "spark-core_2.11" % "2.1.0",
"org.apache.spark" % "spark-sql_2.11" % "2.1.0",
//"org.apache.spark" % "spark-streaming_2.11" % "2.1.0",
//"org.apache.spark" % "spark-mllib_2.11" % "2.1.0",
"org.apache.hadoop" % "hadoop-common" % "3.0.0" % "provided",
"org.jmockit" % "jmockit" % "1.34" % "test",
"org.apache.spark" %% "spark-hive" % "2.1.0"
)