package com.zyz.notes.salary;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.getRequestType()=="请假" && request.getNumber()<=2) {
            System.out.println(name + ": " + request.getRequestContent() + " 数量" + request.getNumber() + " 被批准");
        }else {
            if(superior!=null)
                superior.requestApplications(request);
        }
    }
}
