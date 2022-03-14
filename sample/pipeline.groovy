pipeline
{
     agent any
     tools
     {
         maven 'Maven'
     }

     stages
     {
        stage('Build')
        {
            when
            {
                expression
                {
                    BRANCH_NAME=="master" && CODE_CHANGES==true
                }
            }
            steps{
                      echo "chinnUIL building application is success only if those two expressions are true"
                      sh 'mvn clean package'
            }
        }
        stage('Test'){
            steps{
                      echo "Tesing is done by chinnUIL..."

            }

        }
        stage('Deploy'){
            steps{
                      echo "Tesing is done by chinnUIL..."
                      
            }

        }
     }
}