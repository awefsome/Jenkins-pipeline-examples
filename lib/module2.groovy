import groovy.transform.Field

@Field private scriptEnv = null
@Field private mod1 = null

def load(scriptenv, module1) {
    scriptEnv = scriptenv
    mod1 = module1
}

def module2_test1(){
    //add code for this method
}

def module2_test2(){
    mod1.(some code) //add code for this method
}

return this
