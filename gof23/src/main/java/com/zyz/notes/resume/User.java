package com.zyz.notes.resume;

/**
 * Created by ZhangYuanzhuo on 2017/1/20.
 */
public class User {
    public static void main(String[] args) {
        Resume a = new Resume();
        a.setName("张三");
        a.setGender("男");
        a.setAge(23);
        a.setWorkExperience("2017-03", "Dj");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("2018-06", "Mi");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.toString());
    }
}
