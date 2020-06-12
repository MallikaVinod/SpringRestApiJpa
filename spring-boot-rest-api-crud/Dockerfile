FROM openjdk:8-jdk-alpine
LABEL maintainer=“pmallika92@yahoo.com”
VOLUME /tmp
EXPOSE 8080
ADD target/spring-boot-rest-api-crud-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]