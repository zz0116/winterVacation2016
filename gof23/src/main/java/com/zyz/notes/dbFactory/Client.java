package com.zyz.notes.dbFactory;

/**
 * Created by ZhangYuanzhuo on 2017/1/26.
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();

        IUser iu = DataAccess.createUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = DataAccess.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }
}
