pipeline {
    agent any

    stages {
        stage('Compile Stage') {
            steps {
                 withGradle(gradle : 'gradle_6_7') {
                          sh 'gradle compileKotlin'
                 }
            }
        }

        stage('Testing stage') {
            steps {
                  withGradle(gradle : 'gradle_6_7') {
                           sh 'compileTestKotlin'
                  }
                        }
        }
    }
}