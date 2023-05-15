FROM amazoncorretto:11-alpine-jdk
maintainer DANILOBASCOURLEGUY
COPY target/portfolioBackEnd-0.0.1-SNAPSHOT.jar portfolioapp.jar
ENTRYPOINT ["java","-jar","/portfolioapp.jar"]


