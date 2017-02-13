package com.zyz.notes.observation;

/**
 * Created by ZhangYuanzhuo on 2017/1/26.
 */
public class StockObserver {
    private String name;
    private Informer info;
    public StockObserver(String name, Informer info) {
        this.name = name;
        this.info = info;
    }
    public void closeStockMarket() {
        System.out.println(info.getAction() + name + " 关闭股市行情，继续工作！");
    }
}
