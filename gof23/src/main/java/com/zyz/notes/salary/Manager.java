package com.zyz.notes.salary;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public abstract class Manager {
    protected String name;
    protected Manager superior;

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public Manager(String name) {
        this.name = name;
    }

    abstract public void requestApplications(Request request);
}
