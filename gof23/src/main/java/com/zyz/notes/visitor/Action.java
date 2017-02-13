package com.zyz.notes.visitor;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public abstract class Action {
    public abstract void getManConclusion(Man concreteElementA);
    public abstract void getWomanConclusion(Woman concreteElementB);
}
