package com.zyz.notes.barbecue;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChickenWing();
    }
}
