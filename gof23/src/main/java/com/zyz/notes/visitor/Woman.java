package com.zyz.notes.visitor;

import java.util.Objects;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Woman extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
