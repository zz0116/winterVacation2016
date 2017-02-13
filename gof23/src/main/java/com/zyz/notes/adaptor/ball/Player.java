package com.zyz.notes.adaptor.ball;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public abstract class Player {
    protected String name;
    public Player(String name) {
        this.name = name;
    }
    public abstract void attack();
    public abstract void defense();
}
