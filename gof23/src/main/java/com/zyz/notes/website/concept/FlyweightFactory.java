package com.zyz.notes.website.concept;

import java.util.Hashtable;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweights(String key) {
        return (Flyweight) flyweights.get(key);
    }
}
