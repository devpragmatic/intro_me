package com.devpragmatic.introme.action.execute;

import com.devpragmatic.introme.action.execute.dto.MethodToExecute;
import com.devpragmatic.introme.action.execute.exception.ActionCannotBeExecutedException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ActionExecutorBasic implements ActionExecutor {

    @Override
    public void execute(MethodToExecute methodDescription, Class<?> clazz) throws ActionCannotBeExecutedException {
        try {
            Method methodToExecute = clazz.getMethod(methodDescription.getName());
            methodToExecute.invoke(null);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new ActionCannotBeExecutedException(methodDescription, e);
        }
    }
}
