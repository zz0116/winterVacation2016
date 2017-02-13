package com.zyz.notes.barbecue.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
