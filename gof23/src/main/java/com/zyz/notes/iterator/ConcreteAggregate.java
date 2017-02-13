package com.zyz.notes.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/2/5.
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int Count;

    public Object get(int index) {
        return items.get(index);
    }

    public void add(int index, Object object) {
        items.add(index, object);
        Count++;
    }
}
