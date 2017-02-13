package com.zyz.notes.visitor;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Failing extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println("男人失败时，闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println("女人失败时，眼泪汪汪，谁也劝不了。");
    }
}
