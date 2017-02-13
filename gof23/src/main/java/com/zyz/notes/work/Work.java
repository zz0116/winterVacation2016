package com.zyz.notes.work;

/**
 * Created by ZhangYuanzhuo on 2017/2/2.
 */
public class Work {
    private int time;
    private boolean isDone;
    private State current;

    public Work() {
        current = new ForenoonState();
    }

    public State getState() {
        return current;
    }

    public void setState(State state) {
        this.current = state;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void writeProgram() {
        current.writeProgram(this);
    }
}
