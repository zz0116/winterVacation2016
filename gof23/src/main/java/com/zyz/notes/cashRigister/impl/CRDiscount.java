package com.zyz.notes.cashRigister.impl;

import com.zyz.notes.cashRigister.CRSuper;

/**
 * Created by ZhangYuanzhuo on 2017/1/15.
 */
public class CRDiscount extends CRSuper {
    private double discount;
    @Override
    public double acceptedCash(double money) {
        return money*discount;
    }

    public CRDiscount(double discount) {
        this.discount = discount;
    }
}
