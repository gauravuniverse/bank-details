# Bank details

### Spring boot application to:
    - to fetch bank and branches details
    
### Requirements
    - Java 1.8
    - Maven 3
    - postgres 9.6 and above
    
### To build
    At the project root level, run: 
    - mvn clean install
    
### To run locally:
    - Install postgres 9.6 and above
    - import data file (indian_banks.sql) in database
    - Specify the following properties in *src/main/resources/application.properties
        - spring.datasource.url=jdbc:postgresql://{host}:5432/{database_name}
    - At the project root level run:
        - mvn spring-boot:run
    
    OR
    
    - build: mvn clean install
    - ./target/bankdetails.jar OR java -jar target/bankdetails.jar
    
### To test api-s, swagger is integrated which is accessible on
    - http://{host}:{port}/swagger-ui.html