package com.zyz.notes.salary.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request>=20 && request<30) {
            System.out.println(this.getClass().getName().substring(29) + " 处理请求 " + request);
        }else if(successor != null) {
            successor.handleRequest(request);
        }
    }
}
