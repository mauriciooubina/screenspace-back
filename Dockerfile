## Build stage##
FROM maven:3.5-jdk-8-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml -DskipTests=true clean package
RUN ls -ltra /home/app/target/
## Package stage##
FROM openjdk-18:latest 
COPY --from=build /home/app/target/swagger*.jar /usr/local/lib/swaggerapp.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/swaggerapp.jar"]
