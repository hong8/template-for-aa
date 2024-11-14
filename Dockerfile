From cepgbaseacr.azurecr.io/docker.io/openjdk:17-slim

COPY target/template*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
