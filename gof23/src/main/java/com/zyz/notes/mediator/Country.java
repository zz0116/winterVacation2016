package com.zyz.notes.mediator;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public abstract class Country {
    protected UnitedNations mediator;


    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
