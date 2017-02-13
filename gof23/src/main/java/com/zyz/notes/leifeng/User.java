package com.zyz.notes.leifeng;

/**
 * Created by ZhangYuanzhuo on 2017/1/20.
 */
public class User {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();
    }
}
