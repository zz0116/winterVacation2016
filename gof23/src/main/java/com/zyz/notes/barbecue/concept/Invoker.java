package com.zyz.notes.barbecue.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
