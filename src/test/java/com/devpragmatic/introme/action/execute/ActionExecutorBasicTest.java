package com.devpragmatic.introme.action.execute;

import com.devpragmatic.introme.action.execute.dto.MethodToExecute;
import com.devpragmatic.introme.action.execute.exception.ActionCannotBeExecutedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ActionExecutorBasicTest {

    private static final ActionExecutorBasic actionExecutor = new ActionExecutorBasic();

    @Test
    void shouldExecuteStaticMethod() throws ActionCannotBeExecutedException {
        ClassWithStaticAction.executed = false;
        actionExecutor.execute(new MethodToExecute("doAction"), ClassWithStaticAction.class);
        assertTrue(ClassWithStaticAction.executed);
    }
}
