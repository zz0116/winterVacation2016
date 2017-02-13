package com.zyz.notes.website;

import com.zyz.notes.website.concept.ConcreteFlyweight;

import java.util.Hashtable;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class WebSiteFactory {
    private Hashtable flyweights = new Hashtable();

    public Website getWebSiteCategory(String key) {
        if(!flyweights.containsKey(key))
            flyweights.put(key, new ConcreteWebSite(key));
        return (Website) flyweights.get(key);
    }

    public int getWebSiteCount() {
        return flyweights.size();
    }
}
