pipeline {
        stage('Build') {
            steps {
                sh "sudo /opt/maven/bin/mvn clean package"
            }
        stage('Test') {
            steps {
                sh "sudo /opt/maven/bin/mvn test"
            }
        }
        stage('Deploy') {
            steps {
                sh "sudo docker build -t spring-jenkins:v1 ."
            }
        }
    }
}
