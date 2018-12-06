FROM openjdk:8-jdk-alpine
LABEL maintainer="bhanuchaddha@gmail.com"
EXPOSE 8080
VOLUME /tmp
ARG JAR_FILE=target/hello-kube-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
