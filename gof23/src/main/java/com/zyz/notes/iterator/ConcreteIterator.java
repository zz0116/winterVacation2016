package com.zyz.notes.iterator;

/**
 * Created by ZhangYuanzhuo on 2017/2/5.
 */
public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    Object first() {
        return aggregate.get(0);
    }

    @Override
    Object next() {
        Object ret = null;
        current++;
        if(current<aggregate.Count) {
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    boolean isDone() {
        return current >= aggregate.Count;
    }

    @Override
    Object currentItem() {
        return aggregate.get(current);
    }
}
