package com.devpragmatic.introme.action.get;

import com.devpragmatic.introme.action.get.dto.ActionDescription;
import com.devpragmatic.introme.action.get.dto.Actions;
import org.junit.jupiter.api.Test;

import static com.devpragmatic.introme.action.get.ClassWithActionAsDifferentName.DIFFERENT_ACTION_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EmptyActionDescriptionTest {
    private static final String FIRST_METHOD_NAME = "doAction";
    private static final String SECOND_METHOD_NAME = "doAction2";
    private ActionDiscovererBasic actionDiscovererBasic = new ActionDiscovererBasic();

    @Test
    void shouldReturnActionName(){
        Actions actions = actionDiscovererBasic.getForClass(ClassWithAction.class);
        assertEquals(1, actions.size());
        ActionDescription action = actions.get(FIRST_METHOD_NAME);
        assertNotNull(action);
        assertEquals(FIRST_METHOD_NAME, action.getName());
    }

    @Test
    void shouldReturnActions(){
        Actions actions = actionDiscovererBasic.getForClass(ClassWithActions.class);
        assertEquals(2, actions.size());
        ActionDescription action = actions.get(FIRST_METHOD_NAME);
        assertNotNull(action);
        assertEquals(FIRST_METHOD_NAME, action.getName());
        ActionDescription action2 = actions.get(SECOND_METHOD_NAME);
        assertNotNull(action2);
        assertEquals(SECOND_METHOD_NAME, action2.getName());
    }

    @Test
    void shouldNotReturnMethodWithoutAnnotation(){
        Actions actions = actionDiscovererBasic.getForClass(ClassWithoutAction.class);
        assertEquals(0, actions.size());
    }

    @Test
    void shouldReturnSpecifiedName(){
        Actions actions = actionDiscovererBasic.getForClass(ClassWithActionAsDifferentName.class);
        assertEquals(1, actions.size());
        ActionDescription action = actions.get(DIFFERENT_ACTION_NAME);
        assertNotNull(action);
        assertEquals(DIFFERENT_ACTION_NAME, action.getName());
    }
}
