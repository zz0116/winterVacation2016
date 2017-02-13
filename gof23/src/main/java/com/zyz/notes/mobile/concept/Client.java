package com.zyz.notes.mobile.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class Client {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
