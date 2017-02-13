package com.zyz.notes.visitor.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/9.
 */
public class ConcreteVisitor1 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("ElementA被Visitor1访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ElementB被Visitor1访问");
    }
}
