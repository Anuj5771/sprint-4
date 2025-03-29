package org.unifiedDeploy.ansibleCD

import org.unifiedDeploy.ansibleCD.*
import org.unifiedDeploy.common.*

def call(String url, String branch, String creds, String inventoryPath, String playbookPath) {

    // Create instances of required classes
    def gitCheckOut = new gitCheckOut()
    def wsClean = new wsClean()
    def roleExecution = new roleExecution()

    // Call methods with correct arguments
    wsClean.call()
    gitCheckOut.call(url, branch, creds)  
    roleExecution.call(inventoryPath, playbookPath)
}
