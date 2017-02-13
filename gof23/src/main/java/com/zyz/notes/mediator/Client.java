package com.zyz.notes.mediator;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Client {
    public static void main(String[] args) {
        UnitedNationsSecurityConcil UNSC = new UnitedNationsSecurityConcil();

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);

        c1.declare("不准研制核武器，否则要发动战争！");
        c2.declare("我们没有核武器，也不怕侵略。");
    }
}
