package com.zyz.notes.stock;

/**
 * Created by ZhangYuanzhuo on 2017/1/21.
 */
public class Fund {
    private Stock stock1;

    public Fund() {
        stock1 = new Stock("11111");
    }

    public void collectMoney() {
        stock1.buy();
    }

    public void repay() {
        stock1.sell();
    }
}
