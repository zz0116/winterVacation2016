package com.zyz.notes.cashRigister.impl;

import com.zyz.notes.cashRigister.CRSuper;

/**
 * Created by ZhangYuanzhuo on 2017/1/15.
 */
public class CRCashBack extends CRSuper {
    private int cashCondition;
    private int cashBack;
    @Override
    public double acceptedCash(double money) {
        if(money>=cashCondition)
            return money-Math.floor(money/cashCondition)*cashBack;
        else
            return money;
    }

    public CRCashBack(int cashBack, int cashCondition) {
        this.cashBack = cashBack;
        this.cashCondition = cashCondition;
    }
}
