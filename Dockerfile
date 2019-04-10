FROM openjdk:8-alpine

RUN apk update && apk add bash

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app

COPY target/bankdetails.jar $PROJECT_HOME/bankdetails.jar
COPY indian_banks.sql $PROJECT_HOME/indian_banks.sql

WORKDIR $PROJECT_HOME

CMD ["java", "-Dspring.datasource.url=jdbc:postgresql://bankdetails-psql:54321/bank", "-Djava.security.egd=file:/dev/./urandom","-jar","./bankdetails.jar"]