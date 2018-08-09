Map modules = [:]

pipeline {
    stages {
        stage('Init') {
            steps {
                script{
                    modules.scriptEnv = load "lib\\script_env.groovy"
                    modules.module1 = load "lib\\module1.groovy"
                    modules.module2 = load "lib\\module2.groovy"
                    modules.module1.load(modules.scriptEnv)
                    modules.module2.load(modules.scriptEnv, modules.module1)
                }
            }
        }
        stage('run') {
            steps {
                script{
                    modules.module2.module1_test1()
                    modules.module2.module1_test2()
                    modules.module2.module2_test1()
                    modules.module2.module2_test2()
                }
            }
        }
    }
}
