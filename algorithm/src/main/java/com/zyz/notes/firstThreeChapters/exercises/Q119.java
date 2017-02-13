package com.zyz.notes.firstThreeChapters.exercises;

/**
 * Created by ZhangYuanzhuo on 2017/1/19.
 */
public class Q119 {
    public String q119(int N) {
        String s = "";
        for(int n = N; n>0; n/=2)
            s += (n%2);
        return s;
    }
}
