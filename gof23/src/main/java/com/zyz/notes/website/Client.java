package com.zyz.notes.website;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        Website fx = f.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        Website fy = f.getWebSiteCategory("产品展示");
        fy.use(new User("大鸟"));

        Website fz = f.getWebSiteCategory("产品展示");
        fz.use(new User("娇娇"));

        Website fl = f.getWebSiteCategory("博客");
        fl.use(new User("老顽童"));

        Website fm = f.getWebSiteCategory("博客");
        fm.use(new User("桃谷六仙"));

        Website fn = f.getWebSiteCategory("博客");
        fn.use(new User("南海鳄神"));

        System.out.println("网站分类总数为" + f.getWebSiteCount());
    }
}
