pipeline {
agent any
stages {
stage(‘Build’) {
steps {
sh "/opt/maven/bin/mvn clean package"
}
}
stage(‘Test’) {
steps {
sh "/opt/maven/bin/mvn test"
}
}
  stage('Deploy') {
steps {
bat "C:/Program Files/Docker/Docker/resources/bin/docker build -t spring-jenkins:v1 ."
}
}
}
}
