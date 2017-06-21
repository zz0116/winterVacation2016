package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/6/21.
 */
public class Q126 {
    public boolean circularRotate(String s, String t) {
        return s.length() == t.length() && (s + s).indexOf(t) != -1;
    }
}
