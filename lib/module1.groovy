import groovy.transform.Field

@Field private scriptEnv = null

def load(scriptenv) {
    scriptEnv = scriptenv
}

def module1_test1(){
    //add code for this method
}

def module1_test2(){
    //add code for this method
    scriptEnv.(some function)
}

return this
