package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/1/19.
 */
public class BetterFibonacci {
    public static long[] F(int N) {
        long[] bf = new long[N];
        bf[0] = 0;
        if(N == 0) return bf;
        bf[1] = 1;
        if(N == 1) return bf;
        for(int i=2; i<N; i++)
            bf[i] = bf[i-1] + bf[i-2];
        return bf;
    }
    public static void main(String[] args) {
        long[] f = F(100);
        for(int i=0; i<100; i++)
            StdOut.println(i + " " + f[i]);
    }
}
