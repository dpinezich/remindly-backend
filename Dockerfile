FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/remindly-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]