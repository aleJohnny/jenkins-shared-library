#!/usr/bin/env groovy

def call() {
    echo "Building docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh "docker build -t alejohnny/demo-app:jma-${params.VERSION} ."
        sh "echo ${PASS} | docker login -u ${USER} --password-stdin"
        sh "docker push alejohnny/demo-app:jma-${params.VERSION}"
    }
}