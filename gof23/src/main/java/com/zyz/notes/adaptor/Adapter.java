package com.zyz.notes.adaptor;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
