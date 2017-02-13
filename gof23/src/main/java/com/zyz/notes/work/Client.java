package com.zyz.notes.work;

/**
 * Created by ZhangYuanzhuo on 2017/2/2.
 */
public class Client {
    public static void main(String[] args) {
        Work w1 = new Work();
        w1.setTime(9);
        w1.writeProgram();
        w1.setTime(12);
        w1.writeProgram();
        w1.setTime(13);
        w1.writeProgram();
        w1.setTime(14);
        w1.writeProgram();
        w1.setTime(17);
        w1.writeProgram();

        w1.setDone(false);

        w1.writeProgram();
        w1.setTime(19);
        w1.writeProgram();
        w1.setTime(22);
        w1.writeProgram();
    }
}
