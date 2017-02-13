package com.zyz.notes.decorator;

/**
 * Created by ZhangYuanzhuo on 2017/1/17.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
