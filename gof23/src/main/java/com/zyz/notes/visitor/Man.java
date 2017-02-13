package com.zyz.notes.visitor;

import java.util.Objects;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Man extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
