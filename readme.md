# Simple app for Tomcat

## build jar
./gradlew build

## run jar
java -jar ./build/libs/spring-boot-artifact-1.0-SNAPSHOT.jar

## custom properties (assuming application.properties)
--spring.config.location=/opt/config/

## build war
./gradlew war

## deploy war
copy to apache-tomcat/webapps

# web access
http://localhost:8080/spring-boot-artifact-1.0-SNAPSHOT

