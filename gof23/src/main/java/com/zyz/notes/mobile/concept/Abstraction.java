package com.zyz.notes.mobile.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
