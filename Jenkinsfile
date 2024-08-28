pipeline {
    agent any
    parameters {
        choice(name: 'ENVIRONMENT', choices: ['DEV', 'STAGING', 'PROD'], description: 'Select the environment to deploy to')
    }
    stages {
        stage('Preparation') {
            steps {
                echo 'Preparing for deployment...'
            }
        }
        stage('DEV') {
            when {
                expression { params.ENVIRONMENT == 'DEV' }
            }
            steps {
                echo 'Deploying to DEV environment...'
                sh 'echo Hello Jenkins DEV!'
                // Add your DEV deployment steps here
            }
        }
        stage('STAGING') {
            when {
                expression { params.ENVIRONMENT == 'STAGING' }
            }
            steps {
                echo 'Deploying to STAGING environment...'
                sh 'echo Hello Jenkins STAGING!'
                // Add your STAGING deployment steps here
            }
        }
        stage('PROD') {
            when {
                expression { params.ENVIRONMENT == 'PROD' }
            }
            steps {
                echo 'Deploying to PROD environment...'
                sh 'echo Hello Jenkins PROD!'
                // Add your PROD deployment steps here
            }
        }
    }
    post {
        always {
            echo 'Pipeline completed.'
        }
    }
}
