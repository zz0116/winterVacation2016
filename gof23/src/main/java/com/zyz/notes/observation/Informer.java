package com.zyz.notes.observation;

/**
 * Created by ZhangYuanzhuo on 2017/1/26.
 */
public interface Informer {
    void call();
    String getAction();
    void setAction(String action);
}
