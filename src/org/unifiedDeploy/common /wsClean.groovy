package org.unifiedDeploy.common

def call() {
  stage('Clean Workspace') {
      cleanWs()
  }
}
