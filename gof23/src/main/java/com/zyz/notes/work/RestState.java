package com.zyz.notes.work;

/**
 * Created by ZhangYuanzhuo on 2017/2/2.
 */
public class RestState extends State {
    @Override
    void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getTime() + "点 下班回家了");
    }
}
