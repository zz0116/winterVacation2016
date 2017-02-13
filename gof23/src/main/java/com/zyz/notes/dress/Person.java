package com.zyz.notes.dress;

/**
 * Created by ZhangYuanzhuo on 2017/1/17.
 */
public class Person{
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
        System.out.println(name);
    }

    public void getClothes() {
        System.out.println("拿衣服");
    }
}
