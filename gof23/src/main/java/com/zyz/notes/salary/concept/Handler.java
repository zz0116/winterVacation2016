package com.zyz.notes.salary.concept;

import com.zyz.notes.mobile.HandsetBrand;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
