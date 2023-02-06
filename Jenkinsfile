pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat "C:/apache-maven-3.8.6/bin/mvn clean package"
            }
        }
        stage('Test') {
            steps {
                bat "C:/apache-maven-3.8.6/bin/mvn test"
            }
        }
        stage('Deploy') {
            steps {
                bat "docker build -t spring-jenkins:0.1 ."
                bat 'docker login --username=%DOCKER_HUB_USERNAME% --password=%DOCKER_HUB_PASSWORD%'
                bat "docker push spring-jenkins:0.1"
            }
        }
    }
}
