package com.zyz.notes.firstThreeChapters;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import static org.junit.Assert.*;

/**
 * Created by ZhangYuanzhuo on 2017/6/21.
 */
public class VisualAccumulatorTest {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}