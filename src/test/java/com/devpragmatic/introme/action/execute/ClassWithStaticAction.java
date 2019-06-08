package com.devpragmatic.introme.action.execute;

import com.devpragmatic.introme.action.annotation.Action;

public class ClassWithStaticAction {
    static boolean executed = false;
    @Action
    public static void doAction(){
        executed = true;
    }
}
