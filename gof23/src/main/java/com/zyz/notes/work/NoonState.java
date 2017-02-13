package com.zyz.notes.work;

/**
 * Created by ZhangYuanzhuo on 2017/2/2.
 */
public class NoonState extends State {
    @Override
    void writeProgram(Work work) {
        if(work.getTime()<13) {
            System.out.println("当前时间：" + work.getTime() + "点 饿了，午饭；犯困，午休");
        }else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
