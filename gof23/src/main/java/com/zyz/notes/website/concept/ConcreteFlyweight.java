package com.zyz.notes.website.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight: " + extrinsicstate);
    }
}
