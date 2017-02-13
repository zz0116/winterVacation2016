package com.zyz.notes.cashRigister;

import com.zyz.notes.cashRigister.impl.CRCashBack;
import com.zyz.notes.cashRigister.impl.CRDiscount;
import com.zyz.notes.cashRigister.impl.CRNormal;

/**
 * Created by ZhangYuanzhuo on 2017/1/16.
 */
public class CashContext {
    CRSuper cr = null;
    public CashContext(String type) {
        if (type.equals("正常收费")) {
            cr = new CRNormal();
        } else if (type.equals("满300减100")) {
            cr = new CRCashBack(100, 300);
        } else if (type.equals("打8折")) {
            cr = new CRDiscount(0.8);
        }
    }
    public double getResult(double money) {
        return cr.acceptedCash(money);
    }
}
