package com.zyz.notes.work;

/**
 * Created by ZhangYuanzhuo on 2017/2/2.
 */
public class ForenoonState extends State {
    @Override
    void writeProgram(Work work) {
        if(work.getTime()<12) {
            System.out.println("当前时间：" + work.getTime() + "点 上午工作，精神百倍");
        }else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
