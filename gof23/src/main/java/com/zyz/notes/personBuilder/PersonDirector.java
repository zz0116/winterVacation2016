package com.zyz.notes.personBuilder;

import java.awt.*;

/**
 * Created by ZhangYuanzhuo on 2017/1/24.
 */
public class PersonDirector {
    private PersonBuilder pb;
    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }
    public void createPerson(Pen p) {
        Component c = new Component() {
            @Override
            public void paint(Graphics g) {
                pb.myPaint(g);
            }
        };
        p.add(c);
    }
}
