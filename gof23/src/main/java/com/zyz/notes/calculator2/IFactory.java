package com.zyz.notes.calculator2;

import com.zyz.notes.calculator2.Operation;

/**
 * Created by ZhangYuanzhuo on 2017/1/19.
 */
public interface IFactory {
    Operation CreateOperation();
}
