package com.zyz.notes.observation;

/**
 * Created by ZhangYuanzhuo on 2017/1/26.
 */
public class User {
    public static void main(String[] args) {
        Secretary tongzizhe = new Secretary();

//        Observer tongshi1 = new StockObserver("小张", tongzizhe);
//        Observer tongshi2 = new StockObserver("小王", tongzizhe);
//
//        tongzizhe.attach(tongshi1);
//        tongzizhe.attach(tongshi2);

        tongzizhe.setAction("老板回来了，");

        tongzizhe.call();
    }
}
