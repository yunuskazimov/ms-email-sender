FROM openjdk:16-slim-buster

COPY build/libs/ms-email-sender-0.0.1-SNAPSHOT.jar .

ENTRYPOINT java -jar ms-email-sender-0.0.1-SNAPSHOT.jar