package com.zyz.notes.barbecue;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    abstract public void excuteCommand();
}
