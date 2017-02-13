package com.zyz.notes.dress.impl;

import com.zyz.notes.dress.Decorator;

/**
 * Created by ZhangYuanzhuo on 2017/1/17.
 */
public class Shoes extends Decorator {
    @Override
    public void getClothes() {
        super.getClothes();
        System.out.println("穿鞋子");
    }
}
