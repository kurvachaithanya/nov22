pipeline{
    agent any
    stages{
        stage("clone code"){
            steps{
                println "cloning code"
            }
        }
        stage("build code"){
            steps{
                println "maven"
            }
        }
        stage("upload artifacts to s3"){
            steps{
                println " uploading artifacts to s3"
            }
        }
    }
}