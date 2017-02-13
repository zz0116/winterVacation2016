package com.zyz.notes.website.concept;

import java.util.Hashtable;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Client {
    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweights("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = f.getFlyweights("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = f.getFlyweights("Z");
        fz.operation(--extrinsicstate);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();

        uf.operation(--extrinsicstate);
    }
}
