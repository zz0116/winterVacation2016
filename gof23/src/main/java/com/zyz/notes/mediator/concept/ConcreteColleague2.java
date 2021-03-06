package com.zyz.notes.mediator.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void imform(String message) {
        System.out.println("同事2得到消息：" + message);
    }
}
