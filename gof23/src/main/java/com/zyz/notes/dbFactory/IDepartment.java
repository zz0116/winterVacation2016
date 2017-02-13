package com.zyz.notes.dbFactory;

/**
 * Created by ZhangYuanzhuo on 2017/1/26.
 */
public interface IDepartment {
    void insert(Department department);
    Department getDepartment(int id);
}
