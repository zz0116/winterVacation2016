package com.zyz.notes.iterator;

/**
 * Created by ZhangYuanzhuo on 2017/2/5.
 */
public abstract class Iterator {
    abstract Object first();
    abstract Object next();
    abstract boolean isDone();
    abstract Object currentItem();
}
