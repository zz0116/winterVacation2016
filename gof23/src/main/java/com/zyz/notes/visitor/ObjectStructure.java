package com.zyz.notes.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class ObjectStructure {
    private List<Person> elements = new ArrayList<>();

    public void attach(Person element) {
        elements.add(element);
    }

    public void detach(Person element) {
        elements.remove(element);
    }

    public void display(Action visitor) {
        for (Person e : elements) {
            e.accept(visitor);
        }
    }
}
