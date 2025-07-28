FROM eclipse-temurin:21.0.2_13-jdk
RUN apt-get update && apt-get install -y ca-certificates
WORKDIR /opt
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar