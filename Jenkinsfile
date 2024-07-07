pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Buildiing...'
                java MathMaxi.java
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Release') {
            steps {
                echo 'Releasing...'
            }
        }
    }
}
