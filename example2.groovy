pipeline {
    agent any
    parameters {
        booleanParam(name: 'userbooleanFlag',
                     defaultValue: true,
                     description: '')

        string(name: 'userstring',
               defaultValue: 'dummyString',
               description: '')

        //choices are newline separated
        choice(name: 'userchoice',
               choices: '''choice1
               choice2''',
               description: '')

        //file(defaultValue: 'dummy', description: '', name: 'file')
        //text(defaultValue: 'dummy', description: '', name: 'text')
        //password(defaultValue: 'dummy', description: '', name: 'password')
        //run(defaultValue: 'dummy', description: '', name: 'run')
    }
    stages {
        stage("check parameters") {
            steps {
                echo "booleanParam: ${params.userbooleanFlag}"
                echo "string: ${params.userstring}"
                echo "choice: ${params.userchoice}"
            }
        }
    }
}
