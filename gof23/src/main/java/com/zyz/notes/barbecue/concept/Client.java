package com.zyz.notes.barbecue.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class Client {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        ConcreteCommand c = new ConcreteCommand(r);
        Invoker i = new Invoker();

        i.setCommand(c);
        i.executeCommand();
    }
}
