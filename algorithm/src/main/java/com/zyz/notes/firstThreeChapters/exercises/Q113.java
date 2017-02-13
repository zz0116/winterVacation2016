package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/1/19.
 */
public class Q113 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        if(a!=b) {
            StdOut.println("not equal");
            return;
        }
        int c = StdIn.readInt();
        if(b!=c) {
            StdOut.println("not equal");
        }else {
            StdOut.println("equal");
        }
    }
}
