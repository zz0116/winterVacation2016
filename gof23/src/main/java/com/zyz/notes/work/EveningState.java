package com.zyz.notes.work;

/**
 * Created by ZhangYuanzhuo on 2017/2/2.
 */
public class EveningState extends State {
    @Override
    void writeProgram(Work work) {
        if (work.isDone()) {
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if(work.getTime()<21) {
                System.out.println("当前时间：" + work.getTime() + "点 加班哦，疲累之极");
            }else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
