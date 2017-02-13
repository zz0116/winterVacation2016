package com.zyz.notes.personBuilder;

import java.awt.*;

/**
 * Created by ZhangYuanzhuo on 2017/1/24.
 */
public abstract class PersonBuilder {
    public void myPaint(Graphics g) {
        buildHead(g);
        buildBody(g);
        buildArmLeft(g);
        buildArmRight(g);
        buildLegLeft(g);
        buildLegRight(g);
    }

    public abstract void buildHead(Graphics g);
    public abstract void buildBody(Graphics g);
    public abstract void buildArmLeft(Graphics g);
    public abstract void buildArmRight(Graphics g);
    public abstract void buildLegLeft(Graphics g);
    public abstract void buildLegRight(Graphics g);
}
