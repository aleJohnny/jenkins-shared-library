#!/usr/bin/env groovy

def call() {
    echo "Build the application for branch $env.BRANCH_NAME"
    sh "mvn package"
}
