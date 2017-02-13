package com.zyz.notes.dbFactory;

/**
 * Created by ZhangYuanzhuo on 2017/1/26.
 */
public interface IUser {
    void insert(User user);
    User getUser(int id);
}
