pipeline {
agent any
stages {
stage(‘Build’) {
steps {
bat "C:/apache-maven-3.8.6/bin/mvn clean package"
}
}
stage(‘Test’) {
steps {
bat "C:/apache-maven-3.8.6/bin/mvn test"
}
}
stage('Deploy') {
steps {
bat "C:/Program Files/Docker/Docker/resources/bin/docker build -t spring-jenkins:0.1"
}
}
}
}
