package com.zyz.notes.visitor.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/9.
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {}
}
