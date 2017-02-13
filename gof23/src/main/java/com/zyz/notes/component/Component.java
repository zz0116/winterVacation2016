package com.zyz.notes.component;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public abstract class Component {
    protected String name;
    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
