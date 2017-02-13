package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/1/19.
 */
public class Fibonacci {
    public static long F(int N) {
        if(N == 0) return 0;
        if(N==1) return 1;
        return F(N-1)+F(N-2);
    }
    public static void main(String[] args) {
        for(int N=0; N<100; N++)
            StdOut.println(N+" "+F(N));
    }
}
