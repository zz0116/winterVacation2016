package com.zyz.notes.calculator2;

/**
 * Created by ZhangYuanzhuo on 2017/1/20.
 */
public class User {
    public static void main(String[] args) throws Exception {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.CreateOperation();
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result = oper.getResult();
        System.out.println(result);
    }
}
