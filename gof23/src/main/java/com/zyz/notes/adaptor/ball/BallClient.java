package com.zyz.notes.adaptor.ball;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class BallClient {
    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player m = new Guards("麦克格雷迪");
        m.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
