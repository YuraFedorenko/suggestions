pipeline {
    agent any

    stages {
        stage('Compile Stage') {
            steps {
                 withGradle {
                          sh 'gradle compileKotlin'
                 }
            }
        }

        stage('Testing stage') {
            steps {
                 withGradle) {
                          sh 'compileTestKotlin'
                 }
            }
        }
    }
}