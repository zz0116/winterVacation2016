package com.zyz.notes.barbecue;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class Client {
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        BakeChickenWingCommand bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand1);

        girl.inform();
    }
}
