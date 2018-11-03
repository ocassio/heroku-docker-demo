FROM openjdk:8-jdk-alpine

COPY target/heroku-docker-demo.jar app.jar

CMD ["java", "-jar", "app.jar"]
