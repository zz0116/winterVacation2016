package com.zyz.notes.calculator2;

/**
 * Created by ZhangYuanzhuo on 2017/1/19.
 */
public class SubFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationSub();
    }
}
