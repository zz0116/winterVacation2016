package com.zyz.notes.mediator.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
