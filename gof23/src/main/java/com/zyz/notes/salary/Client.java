package com.zyz.notes.salary;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public class Client {
    public static void main(String[] args) {
        CommonManager jinli = new CommonManager("金利");
        Majordomo zongjian = new Majordomo("宗剑");
        GeneralManager zhongjingli = new GeneralManager("钟精励");
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zhongjingli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jinli.requestApplications(request);

        Request request1 = new Request();
        request1.setRequestType("加薪");
        request1.setRequestContent("小菜请求加薪");
        request1.setNumber(1000);
        jinli.requestApplications(request1);
    }
}
