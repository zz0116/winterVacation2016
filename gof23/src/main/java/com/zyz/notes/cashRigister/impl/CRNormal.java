package com.zyz.notes.cashRigister.impl;

import com.zyz.notes.cashRigister.CRSuper;

/**
 * Created by ZhangYuanzhuo on 2017/1/15.
 */
public class CRNormal extends CRSuper {
    @Override
    public double acceptedCash(double money) {
        return money;
    }
}
