package com.zyz.notes.firstThreeChapters.exercises.q1315;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/6/24.
 */
public class ReciprocalOfK {
    public static void main(String[] args) {
        In in = new In("D:\\Program Files\\MATLAB\\R2016a\\mcr\\toolbox\\matlab\\connector\\jar\\cometd-license.txt");
        String[] strings = in.readAllStrings();

        int k = StdIn.readInt();
        StdOut.println(strings[strings.length - k]);
    }
}
