#!/bin/sh

sbt assembly

# install gatling mqtt jar file into local maven repository
# these classes are used in thingsboard performance-tests project
mvn install:install-file -Dfile=target/scala-2.12/gatling-mqtt-assembly-1.0.0-SNAPSHOT.jar -DgroupId=com.hashmapinc -DartifactId=gatling-mqtt_2.12 -Dversion=1.0.0 -Dpackaging=jar

mvn install:install-file -Dfile=target/scala-2.12/gatling-mqtt-assembly-1.0.0-SNAPSHOT.jar -DgroupId=com.hashmapinc -DartifactId=gatling-mqtt -Dversion=1.0.0 -Dpackaging=jar
