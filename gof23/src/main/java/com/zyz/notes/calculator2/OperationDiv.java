package com.zyz.notes.calculator2;

import com.zyz.notes.calculator2.Operation;

/**
 * Created by ZhangYuanzhuo on 2017/1/15.
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        double result = 0;
        if(getNumberB()==0)
            throw new Exception("除数不能为0！");
        result = getNumberA() / getNumberB();
        return result;
    }
}
