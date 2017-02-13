package com.zyz.notes.leifeng;

/**
 * Created by ZhangYuanzhuo on 2017/1/20.
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
