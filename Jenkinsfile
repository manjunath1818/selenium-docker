pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                //SH
                bat MVN clean package -DskipTests
            }
        }
        stage('Build Image') {
            steps {
                //SH
                bat docker build -t manjunathk/SeleniumDocker .
            }
        }
        stage('Push Image') {
            steps {
			    withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'pass', usernameVariable: 'user')]) {
                    //sh
			        bat "docker login --username=${user} --password=${pass}"
			        bat "docker push manjuDocker/SeleniumDocker:latest"
			    }                           
            }
        }
    }
}