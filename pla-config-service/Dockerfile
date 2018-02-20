FROM openjdk:8-jre-alpine

MAINTAINER about.me/ocristian

COPY ./target/pla-config-service-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app/

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]

EXPOSE 8888