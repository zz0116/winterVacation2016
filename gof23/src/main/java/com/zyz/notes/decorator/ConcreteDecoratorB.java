package com.zyz.notes.decorator;

/**
 * Created by ZhangYuanzhuo on 2017/1/17.
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        AddedBehavior();
        System.out.println("具体装饰B的操作");
    }

    private void AddedBehavior() {

    }
}
