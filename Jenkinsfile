/* Requires the Docker Pipeline plugin */
@Library('sample-library') _ 
pipeline {
    agent { docker { image 'node:16.17.1-alpine' } }
    stages {
        stage('build') {
            steps {
                sh 'node --version'
                foo { echo BAR }
		foo (["variable", "tests"], { echo tests  })	
	    }
        }
    }
}
