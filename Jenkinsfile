pipeline {
    agent any

    stages {
        stage('DEV') {
            steps {
                echo 'DEV...'
                // Here you would add the commands to compile/build your project
                // For example: sh 'make'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
                // Commands to run tests go here
                // For example: sh 'make test'
            }
        }

        stage('Prod') {
            steps {
                echo 'Deploying...'
                // Deployment commands go here
                // For example: sh 'make deploy'
            }
        }
    }

    post {
        always {
            echo 'Cleaning up...'
            // Any cleanup tasks can be added here
        }
        success {
            echo 'Build was successful!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
