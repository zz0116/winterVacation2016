package com.zyz.notes.interpreter;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
