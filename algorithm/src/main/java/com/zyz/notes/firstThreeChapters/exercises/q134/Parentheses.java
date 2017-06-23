package com.zyz.notes.firstThreeChapters.exercises.q134;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/6/23.
 */
public class Parentheses {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            char cur = StdIn.readChar();
            if (cur == '}') {
                if (!(stack.pop() == '{')) {
                    StdOut.println("false");
                    break;
                }
            } else if (cur == ']') {
                if (!(stack.pop() == '[')) {
                    StdOut.println("false");
                    break;
                }
            } else if (cur == ')') {
                if (!(stack.pop() == '(')) {
                    StdOut.println("false");
                    break;
                }
            } else {
                stack.push(cur);
            }
        }
        StdOut.println(stack.isEmpty()? "true" : "false");
    }
}
