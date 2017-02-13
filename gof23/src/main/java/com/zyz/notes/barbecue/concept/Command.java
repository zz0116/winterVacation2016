package com.zyz.notes.barbecue.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract public void execute();
}
