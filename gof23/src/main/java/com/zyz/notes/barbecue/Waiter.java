package com.zyz.notes.barbecue;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class Waiter {
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if(command.toString().contains("ChickenWing")) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
        }else {
            orders.add(command);
            System.out.println("增加订单：" + command.toString() + "  时间：" + new Date());
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单：" + command.toString() + "  时间：" + new Date());
    }

    public void inform() {
        orders.forEach(Command::excuteCommand);
    }
}
