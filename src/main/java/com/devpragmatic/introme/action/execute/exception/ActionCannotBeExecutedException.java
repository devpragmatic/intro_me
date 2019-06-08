package com.devpragmatic.introme.action.execute.exception;

import com.devpragmatic.introme.action.execute.dto.MethodToExecute;

public class ActionCannotBeExecutedException extends Exception{

    public ActionCannotBeExecutedException(MethodToExecute methodDescription, Throwable cause) {
        super(String.format("Action %s cannot be executed.",methodDescription.getName()), cause);
    }
}
