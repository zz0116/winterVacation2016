package com.zyz.notes.adaptor.ball;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋" + name + "防守");
    }
}
