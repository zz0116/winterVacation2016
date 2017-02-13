package com.zyz.notes.adaptor.ball;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class Translator extends Player {
    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.进攻();
    }

    @Override
    public void defense() {
        wjzf.防守();
    }
}
