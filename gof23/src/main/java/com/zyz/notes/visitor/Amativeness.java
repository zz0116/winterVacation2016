package com.zyz.notes.visitor;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Amativeness extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println("男人恋爱时，凡是不懂也要装懂。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println("女人恋爱时，遇事懂也装作不懂。");
    }
}
