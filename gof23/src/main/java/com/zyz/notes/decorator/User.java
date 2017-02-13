package com.zyz.notes.decorator;

/**
 * Created by ZhangYuanzhuo on 2017/1/17.
 */
public class User {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();

    }
}
