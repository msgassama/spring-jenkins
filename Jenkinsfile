pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh "sudo /opt/maven/bin/mvn clean package"
            }
        }
        stage('Test') {
            steps {
                sh "sudo /opt/maven/bin/mvn test"
            }
        }
        stage('Install Docker') {
            steps {
                sh 'sudo apt-get update && sudo apt-get install -y docker.io'
            }
        }
        stage('Deploy') {
            steps {
                sh "sudo docker build -t spring-jenkins:v1 ."
            }
        }
    }
}
