def gv
pipeline
{
    agent any
    tools
    {
        maven 'Maven'
    }
    stages
    {
        stage('init')
        {
            steps
            {
                script{
                     gv= load "chinnU.groovy"
                }
            }
        }
        stage('Build')
        {
            steps{
                script{
                    gv.buildApp()
            }
        }
        stage('Test')
        {
            steps{
                script{
                    gv.testApp()
                }
            }
        }
        stage{
            steps{
                script{
                    gv.deployApp()
                }
            }
        }
    }
}