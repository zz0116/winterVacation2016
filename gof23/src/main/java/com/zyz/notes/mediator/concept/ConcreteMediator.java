package com.zyz.notes.mediator.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague.equals(colleague1)) {
            colleague2.imform(message);
        }else {
            colleague1.imform(message);
        }
    }
}
