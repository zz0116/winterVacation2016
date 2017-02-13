package com.zyz.notes.interpreter;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
