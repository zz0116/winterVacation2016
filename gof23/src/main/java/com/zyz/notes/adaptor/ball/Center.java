package com.zyz.notes.adaptor.ball;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋" + name + "防守");
    }
}
