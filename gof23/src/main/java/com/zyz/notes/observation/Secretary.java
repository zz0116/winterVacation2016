package com.zyz.notes.observation;

import java.beans.EventHandler;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/1/26.
 */
public class Secretary implements Informer {
//    public EventHandler update;
    private String action;

    public void call() {
//        update();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
