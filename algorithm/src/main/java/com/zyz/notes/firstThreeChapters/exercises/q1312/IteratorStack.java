package com.zyz.notes.firstThreeChapters.exercises.q1312;

import edu.princeton.cs.algs4.Stack;

import java.util.Iterator;

/**
 * Created by ZhangYuanzhuo on 2017/6/24.
 */
public class IteratorStack {
    public static Stack copy(Stack<String> stack) {
        Stack<String> copy = new Stack<>();
        for (String s : stack) {
            copy.push(s);
        }
        return copy;
    }
}
