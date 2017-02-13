package com.zyz.notes.calculator;

import com.zyz.notes.calculator.Operation;

/**
 * Created by ZhangYuanzhuo on 2017/1/15.
 */
public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}
