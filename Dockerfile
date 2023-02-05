FROM openjdk:11
ADD target/spring-jenkins-0.0.1-SNAPSHOT.jar spring-jenkins.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "spring-jenkins.jar"]