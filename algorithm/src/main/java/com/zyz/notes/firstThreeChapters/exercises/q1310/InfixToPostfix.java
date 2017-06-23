package com.zyz.notes.firstThreeChapters.exercises.q1310;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/6/23.
 */
public class InfixToPostfix {
    public static String sOut;

    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (!s.equals("(")) {
                out.append(s).append(" ");
            }
        }
        sOut = String.valueOf(out);
        StdOut.println(out);
    }
}
