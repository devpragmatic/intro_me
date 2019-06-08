package com.devpragmatic.introme.action.get;

public class ActionDiscovererBasicFactory implements ActionDiscovererFactory {


    @Override
    public ActionDiscoverer create() {
        return new ActionDiscovererBasic();
    }
}
