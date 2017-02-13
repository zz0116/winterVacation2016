package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/1/19.
 */
public class Q117 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t-9.0/t)>.001)
            t = (9.0/t+t)/2.0;
        StdOut.printf("%.5f\n", t);
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println("b" + "c");
        System.out.println((char) ('a' + 4));
    }
}
