package com.zyz.notes.stock;

/**
 * Created by ZhangYuanzhuo on 2017/1/21.
 */
public class Stock {
    private String stockName;

    public void buy() {
        System.out.println("买入" + this.stockName);
    }

    public void sell() {
        System.out.println("卖出" + this.stockName);
    }

    public Stock(String stockName) {
        this.stockName = stockName;
    }
}
