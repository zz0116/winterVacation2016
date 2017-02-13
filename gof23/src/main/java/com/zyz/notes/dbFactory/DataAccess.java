package com.zyz.notes.dbFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by ZhangYuanzhuo on 2017/2/1.
 */
public class DataAccess {
    private static String assemblyName = "com.zyz.notes.dbFactory";
//    private static String db = "Sqlserver";

    private static String getDb() {
        Properties prop = new Properties();
        try {
            prop.load(DataAccess.class.getClassLoader().getResourceAsStream("App.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty("DB");
    }

    public static IUser createUser() {
        String className = assemblyName + "." + getDb() + "User";
        try {
            return (IUser) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static IDepartment createDepartment() {
        String className = assemblyName + "." + getDb() + "Department";
        try {
            return (IDepartment) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
