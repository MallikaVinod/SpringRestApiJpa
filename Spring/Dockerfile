FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD ./target/user.jar user.jar.jar
ENTRYPOINT ["java","-jar","/user.jar"]