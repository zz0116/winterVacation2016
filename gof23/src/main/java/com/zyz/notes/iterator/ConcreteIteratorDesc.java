package com.zyz.notes.iterator;

/**
 * Created by ZhangYuanzhuo on 2017/2/5.
 */
public class ConcreteIteratorDesc extends Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.Count-1;
    }

    @Override
    Object first() {
        return aggregate.get(aggregate.Count-1);
    }

    @Override
    Object next() {
        Object ret = null;
        current--;
        if(current>=0) {
            ret =  aggregate.get(current);
        }
        return ret;
    }

    @Override
    boolean isDone() {
        return current < 0;
    }

    @Override
    Object currentItem() {
        return aggregate.get(current);
    }
}
