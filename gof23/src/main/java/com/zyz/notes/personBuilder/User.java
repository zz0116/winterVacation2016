package com.zyz.notes.personBuilder;

/**
 * Created by ZhangYuanzhuo on 2017/1/24.
 */
public class User {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonThinBuilder();
        PersonDirector pd = new PersonDirector(pb);
        Pen p = new Pen();
        pd.createPerson(p);
    }
}
