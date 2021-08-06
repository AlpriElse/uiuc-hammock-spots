# Build Stage
FROM maven:3.6.0-jdk-11-slim AS build

COPY src ./home/app/src

COPY pom.xml ./home/app/pom.xml

RUN mvn -f ./home/app/pom.xml clean package

# Package Stage
FROM openjdk:11-jre-slim

COPY --from=build /home/app/target/uiuc_hammock_spots-1.0-SNAPSHOT.jar /home/app/app.jar

COPY config.yml ./home/app/config.yml

EXPOSE 8080

RUN ls ./home

ENTRYPOINT ["java","-jar","/home/app/app.jar", "server", "/home/app/config.yml"]