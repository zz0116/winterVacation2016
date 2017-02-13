package com.zyz.notes.visitor.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/9.
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
