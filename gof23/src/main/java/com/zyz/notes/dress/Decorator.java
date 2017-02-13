package com.zyz.notes.dress;

/**
 * Created by ZhangYuanzhuo on 2017/1/17.
 */
public class Decorator extends Person {
    Person person;

    @Override
    public void getClothes() {
        if(person != null) {
            person.getClothes();
        }
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
