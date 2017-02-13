package com.zyz.notes.visitor;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Success extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println("男人成功时，背后多半有一个伟大的女人。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println("女人成功时，背后大多有一个不成功的男人。");
    }
}
