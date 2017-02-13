package com.zyz.notes.work;

/**
 * Created by ZhangYuanzhuo on 2017/2/2.
 */
public class AfternoonState extends State {
    @Override
    void writeProgram(Work work) {
        if(work.getTime()<17) {
            System.out.println("当前时间：" + work.getTime() + "点 下午状态还不错，继续努力");
        }else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
