package com.devpragmatic.introme.action.get.dto;

import java.util.HashMap;
import java.util.Map;

public class Actions {
    private Map<String, ActionDescription> store = new HashMap<>();
    public int size() {
        return store.size();
    }

    public ActionDescription get(String actionName) {
        return store.get(actionName);
    }

    public void add(ActionDescription actionDescription) {
        store.put(actionDescription.getName(), actionDescription);
    }
}
