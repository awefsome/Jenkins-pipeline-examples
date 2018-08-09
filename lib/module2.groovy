import groovy.transform.Field

@Field private scriptEnv = null

def load(scriptenv, mod1) {
    scriptEnv = scriptenv
}

def module2_test1(){
    //add code for this method
}

def module2_test2(){
    mod1.(some code) //add code for this method
}

return this
