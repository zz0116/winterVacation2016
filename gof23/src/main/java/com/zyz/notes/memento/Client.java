package com.zyz.notes.memento;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class Client {
    public static void main(String[] args) {
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(lixiaoyao.saveState());

        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        lixiaoyao.recoveryState(stateAdmin.getMemento());
        lixiaoyao.stateDisplay();
    }
}
