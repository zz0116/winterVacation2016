package com.zyz.notes.mediator;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息：" + message);
    }
}
