package com.devpragmatic.introme.action.get;

public class ActionDiscoveryBasicFactory implements ActionDiscovererFactory {


    @Override
    public ActionDiscoverer create() {
        return new ActionDiscovererBasic();
    }
}
