pipeline {
    agent any

    stages {
        stage('Compile Stage') {
            steps {
                 gradlew('compileKotlin')
            }
        }

        stage('Testing stage') {
            steps {
                 gradlew('compileTestKotlin')
            }
        }
    }
}

def gradlew(String... args) {
    sh "gradle ${args.join(' ')} -s"
}