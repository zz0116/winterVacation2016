package com.zyz.notes.memento;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class GameRole {
    private int vit;
    private int atk;
    private int def;

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public void stateDisplay() {
        System.out.println("角色当前状态：" +
                "\n体力：" + this.vit +
                "\n攻击力：" + this.atk +
                "\n防御力：" + this.def +
                "\n");
    }

    public void getInitState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }
}
