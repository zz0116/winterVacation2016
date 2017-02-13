package com.zyz.notes.singleton;

/**
 * Created by ZhangYuanzhuo on 2017/2/5.
 */
public class Singleton {
    private static Singleton instance;
    private static Object syncRoot = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance==null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
