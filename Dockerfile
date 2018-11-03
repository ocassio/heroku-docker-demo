FROM openjdk:8-jdk-alpine

COPY target/heroku-docker-demo.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
