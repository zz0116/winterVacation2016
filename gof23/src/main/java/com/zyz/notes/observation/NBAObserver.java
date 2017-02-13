package com.zyz.notes.observation;

/**
 * Created by ZhangYuanzhuo on 2017/1/26.
 */
public class NBAObserver {
    private String name;
    private Informer info;
    public NBAObserver(String name, Informer info) {
        this.name = name;
        this.info = info;
    }

    public void closeNBADirectSeeding() {
        System.out.println(info.getAction() + name + " 关闭NBA直播，继续工作！");
    }
}
