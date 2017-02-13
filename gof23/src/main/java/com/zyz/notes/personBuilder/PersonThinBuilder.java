package com.zyz.notes.personBuilder;

import java.awt.*;

/**
 * Created by ZhangYuanzhuo on 2017/1/24.
 */
public class PersonThinBuilder extends PersonBuilder {
    @Override
    public void buildHead(Graphics g) {
        g.drawOval(50, 20, 30, 30);
    }

    @Override
    public void buildBody(Graphics g) {
        g.drawRect(60, 50, 10, 50);
    }

    @Override
    public void buildArmLeft(Graphics g) {
        g.drawLine(60, 50, 40, 100);
    }

    @Override
    public void buildArmRight(Graphics g) {
        g.drawLine(70, 50, 90, 100);
    }

    @Override
    public void buildLegLeft(Graphics g) {
        g.drawLine(60, 100, 45, 150);
    }

    @Override
    public void buildLegRight(Graphics g) {
        g.drawLine(70, 100, 85, 150);
    }
}
