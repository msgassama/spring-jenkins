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
}
}
