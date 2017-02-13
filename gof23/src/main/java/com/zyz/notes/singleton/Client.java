package com.zyz.notes.singleton;

/**
 * Created by ZhangYuanzhuo on 2017/2/5.
 */
public class Client {
    public static void main(String[] args) {
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
        EasySingleton s1 = EasySingleton.INSTANCE;
        EasySingleton s2 = EasySingleton.INSTANCE;

        if(s1==s2) {
            System.out.println("两个对象是相同的实例。");
        }
    }
}
