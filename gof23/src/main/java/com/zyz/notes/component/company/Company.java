package com.zyz.notes.component.company;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);
    public abstract void lineOfDuty();
}
