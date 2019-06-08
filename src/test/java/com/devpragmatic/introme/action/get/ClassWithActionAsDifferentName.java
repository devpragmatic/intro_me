package com.devpragmatic.introme.action.get;

import com.devpragmatic.introme.action.annotation.Action;

class ClassWithActionAsDifferentName {

    static final String DIFFERENT_ACTION_NAME = "differentActionName";

    @Action(name = DIFFERENT_ACTION_NAME)
    public void doAction(){
        //only for test
    }
}
