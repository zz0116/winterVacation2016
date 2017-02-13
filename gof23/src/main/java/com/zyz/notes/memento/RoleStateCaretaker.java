package com.zyz.notes.memento;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
