FROM openjdk:16-jdk-alpine
COPY ./target/SPE_mini_project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","SPE_mini_project-1.0-SNAPSHOT-jar-with-dependencies.jar"]