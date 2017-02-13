package com.zyz.notes.calculator;

/**
 * Created by ZhangYuanzhuo on 2017/1/15.
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation oper = null;
        if (operate.equals("+")) {
            oper = new OperationAdd();

        } else if (operate.equals("-")) {
            oper = new OperationSub();

        } else if (operate.equals("*")) {
            oper = new OperationMul();

        } else if (operate.equals("/")) {
            oper = new OperationDiv();

        }
        return oper;
    }
}
