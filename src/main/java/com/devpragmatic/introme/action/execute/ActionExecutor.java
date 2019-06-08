package com.devpragmatic.introme.action.execute;

import com.devpragmatic.introme.action.execute.dto.MethodToExecute;
import com.devpragmatic.introme.action.execute.exception.ActionCannotBeExecutedException;

public interface ActionExecutor {
    void execute(MethodToExecute methodDescription, Class<?> clazz) throws ActionCannotBeExecutedException;
}
