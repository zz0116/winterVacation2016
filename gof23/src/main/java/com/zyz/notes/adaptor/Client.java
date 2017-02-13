package com.zyz.notes.adaptor;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
