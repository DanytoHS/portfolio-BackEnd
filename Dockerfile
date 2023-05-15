FROM amazoncorretto:11-alpine-jdk
maintainer DANILO BASCOURLEGUY
COPY target/portfolioBackEnd-0.0.1-SNAPSHOT.jar portfolio-app
ENTRYPOINT ["java","-jar","/portfolio-app"]


