pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build Go Code') {
            steps {
                sh 'go build -o myapp .D:/projects/mitrahsoft/www.acf.local/projects/advance_topic/jenkins/Jenkins_test/main.go'
            }
        }

        stage('Test Go Code') {
            steps {
                sh 'go test .D:/projects/mitrahsoft/www.acf.local/projects/advance_topic/jenkins/Jenkins_test/main_test.go/...'
            }
        }
    }

    post {
        success {
            echo 'Build and test successful.'
        }
        failure {
            echo 'Build or test failed.'
        }
    }
}
