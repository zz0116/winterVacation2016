package com.zyz.notes.interpreter.player;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Scale extends Expression {
    @Override
    public void excute(String key, Double value) {
        String scale = "";
        switch (value.intValue()) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
        }
        System.out.print(scale+" ");
    }
}
