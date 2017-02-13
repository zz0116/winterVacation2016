package com.zyz.notes.dbFactory;

import com.sun.org.apache.bcel.internal.generic.IUSHR;

/**
 * Created by ZhangYuanzhuo on 2017/1/26.
 */
public class SqlserverUser implements IUser {
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    public User getUser(int id) {
        System.out.println("在SQL Server中根据id得到User表一条记录");
        return null;
    }
}
