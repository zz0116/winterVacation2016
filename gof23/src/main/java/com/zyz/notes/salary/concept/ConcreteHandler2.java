package com.zyz.notes.salary.concept;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request>=10 && request<20) {
            System.out.println(this.getClass().getName().substring(29) + " 处理请求 " + request);
        }else if(successor != null) {
            successor.handleRequest(request);
        }
    }
}
