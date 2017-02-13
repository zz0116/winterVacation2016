package com.zyz.notes.visitor;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public abstract class Person {
    public abstract void accept(Action visitor);
}
