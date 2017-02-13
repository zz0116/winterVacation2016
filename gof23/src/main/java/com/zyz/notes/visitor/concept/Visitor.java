package com.zyz.notes.visitor.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/9.
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
