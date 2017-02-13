package com.zyz.notes.decorator;

/**
 * Created by ZhangYuanzhuo on 2017/1/17.
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;
    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰A的操作");
    }
}
