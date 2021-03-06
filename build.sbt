lazy val root=project
    .in(file("."))
    .settings(
      name := "gatling-bolt",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.12.3",
      libraryDependencies ++= Seq(
        "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.2.1",
        "io.gatling" % "gatling-test-framework" % "3.2.1",

        "org.neo4j.driver" % "neo4j-java-driver" % "1.7.5",
        "com.dimafeng" %% "testcontainers-scala" % "0.32.0" % "test",

//        "org.neo4j.test" % "neo4j-harness" % "3.2.5" % "test",
//        "com.sun.jersey" % "jersey-core" % "1.19" % "test",

        "org.scalatest" %% "scalatest" % "3.0.1" % "test" // 3.0.8
      )
    ).enablePlugins(GatlingPlugin)

publishArtifact in(Test, packageBin) := true

parallelExecution in Test := false
