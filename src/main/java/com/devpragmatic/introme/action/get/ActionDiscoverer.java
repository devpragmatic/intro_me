package com.devpragmatic.introme.action.get;

import com.devpragmatic.introme.action.get.dto.Actions;

public interface ActionDiscoverer {
    Actions getForClass(Class<?> clazz);
}
