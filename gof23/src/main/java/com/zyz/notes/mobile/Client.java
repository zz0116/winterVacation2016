package com.zyz.notes.mobile;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class Client {
    public static void main(String[] args) {
        HandsetBrand ab;
        ab = new HandsetBrandN();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandM();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
    }
}
