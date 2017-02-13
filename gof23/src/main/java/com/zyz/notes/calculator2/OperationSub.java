package com.zyz.notes.calculator2;

import com.zyz.notes.calculator2.Operation;

/**
 * Created by ZhangYuanzhuo on 2017/1/15.
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}
