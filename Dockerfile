FROM openjdk:11
EXPOSE 8080
ADD target/Jenkins-0.0.1-SNAPSHOT.jar Jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Jenkins-0.0.1-SNAPSHOT.jar"]