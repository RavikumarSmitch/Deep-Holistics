pipeline {
    agent any
    parameters {
        choice(name: 'ENVIRONMENT', choices: ['Staging', 'Prod'], description: 'Select the environment to deploy to')
    }
    stages {
        stage('Hello') {
            when {
                expression { params.ENVIRONMENT == 'Staging' || params.ENVIRONMENT == 'Prod' }
            }
            steps {
                script {
                    if (params.ENVIRONMENT == 'Staging') {
                        sh 'echo Hello Jenkins Staging!'
                    } else if (params.ENVIRONMENT == 'Prod') {
                        sh 'echo Hello Jenkins Prod!'
                    }
                }
            }
        }
    }
}
