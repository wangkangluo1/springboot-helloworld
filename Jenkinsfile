pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean package -Dmaven.test.skip=true'
      }
    }
  }
}