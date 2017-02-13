package com.zyz.notes.mobile;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
