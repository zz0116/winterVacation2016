package com.zyz.notes.calculator;

/**
 * Created by ZhangYuanzhuo on 2017/1/15.
 */
public class User {
    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.createOperate("+");
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result = 0;
        try {
            result = oper.getResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
