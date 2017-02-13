package com.zyz.notes.barbecue;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }
}
