FROM amazoncorretto:17

MAINTAINER LisanRios

COPY target/porfolioweb-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
