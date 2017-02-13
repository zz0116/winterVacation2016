package com.zyz.notes.mobile.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
