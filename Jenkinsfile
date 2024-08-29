pipeline{
    agent any
    tools{
        maven 'maven_3_5_0'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/anbu-15/Jenkins_integrated_Docker']])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker image'){
            steps{
                script{
                    bat 'docker build -t anbarasu1509/devops-integration .'
                }
            }
        }
        stage('Push image to Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u anbarasu1509 -p %dockerhubpwd%'
                    }
                    bat 'docker push anbarasu1509/devops-integration'
                }
            }
        }
    }
}
