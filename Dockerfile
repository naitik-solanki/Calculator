FROM openjdk:11
COPY ./target/SPE_mini_project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]