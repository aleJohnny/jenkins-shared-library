#!/usr/bin/env groovy

def call() {
    echo "Build the application..."
    sh "mvn package"
}
