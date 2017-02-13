package com.zyz.notes.website;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class ConcreteWebSite extends Website {
    private String name = "";
    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }
}
