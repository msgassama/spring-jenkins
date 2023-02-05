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
sh '/Applications/Docker.app/Contents/Resources/bin/docker/docker build -t spring-jenkins:v1 .'
}
}
}
}
