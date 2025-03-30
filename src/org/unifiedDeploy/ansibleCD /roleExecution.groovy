package org.unifiedDeploy.ansibleCD

def call(String inventoryPath, String playbookPath) {
    stage("Ansible Execution") {
        script {
            sh """
            ansible-playbook -i ${inventoryPath} ${playbookPath}
            """
        }
    }
}
