pipeline {
    agent {
        label 'docker'
    }
    stages {
        stage('Build') {
            steps {
                sh "/opt/maven/bin/mvn clean package"
            }
        }
        stage('Test') {
            steps {
                sh "/opt/maven/bin/mvn test"
            }
        }
        stage('Install Docker') {
            steps {
                sh 'apt-get update && apt-get install -y docker.io'
            }
        }
        stage('Deploy') {
            steps {
                sh "docker build -t spring-jenkins:v1 ."
            }
        }
    }
}
