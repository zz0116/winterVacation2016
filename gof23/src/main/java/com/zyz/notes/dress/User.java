package com.zyz.notes.dress;

import com.zyz.notes.dress.impl.Coat;
import com.zyz.notes.dress.impl.Pants;

/**
 * Created by ZhangYuanzhuo on 2017/1/17.
 */
public class User {
    public static void main(String[] args) {
        Person p = new Person("张三");
        Coat coat = new Coat();
        Pants pants = new Pants();

        coat.setPerson(p);
        pants.setPerson(coat);
        pants.getClothes();
    }
}
