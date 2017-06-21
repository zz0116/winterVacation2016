package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by ZhangYuanzhuo on 2017/6/21.
 */
public class Q127 {
    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        System.out.println(mystery(StdIn.readString()));
    }
}
