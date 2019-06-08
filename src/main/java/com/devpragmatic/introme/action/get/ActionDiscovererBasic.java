package com.devpragmatic.introme.action.get;

import com.devpragmatic.introme.action.annotation.Action;
import com.devpragmatic.introme.action.get.dto.ActionDescription;
import com.devpragmatic.introme.action.get.dto.Actions;

import java.lang.reflect.Method;

class ActionDiscovererBasic implements ActionDiscoverer{

    ActionDiscovererBasic() {
    }

    @Override
    public Actions getForClass(Class<?> clazz) {
        return discoverForMethods(clazz.getMethods());
    }

    private Actions discoverForMethods(Method[] methods) {
        Actions actions = new Actions();
        for(Method method : methods){
            if(isAction(method)){
                ActionDescription actionDescription = describeTheAction(method);
                actions.add(actionDescription);
            }
        }
        return actions;
    }

    private ActionDescription describeTheAction(Method method) {
        Action action = method.getAnnotation(Action.class);
        if(action != null && !action.name().isEmpty()){
            return new ActionDescription(action.name());
        }
       return new ActionDescription(method.getName());
    }

    private boolean isAction(Method method) {
        return method.isAnnotationPresent(Action.class);
    }
}
