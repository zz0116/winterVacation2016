package com.zyz.notes.iterator;

/**
 * Created by ZhangYuanzhuo on 2017/2/5.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();

        a.add(0, "大鸟");
        a.add(1, "小菜");
        a.add(2, "行李");
        a.add(3, "老外");
        a.add(4, "公交内部员工");
        a.add(5, "小偷");

//        Iterator i = new ConcreteIterator(a);
        Iterator i = new ConcreteIteratorDesc(a);
        Object item = i.first();
        while (!i.isDone()) {
            System.out.println(i.currentItem() + " 请买车票！");
            i.next();
        }
    }
}
