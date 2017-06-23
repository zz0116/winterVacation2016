package com.zyz.notes.firstThreeChapters.exercises.q1311;

import com.zyz.notes.firstThreeChapters.exercises.q1310.InfixToPostfix;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by ZhangYuanzhuo on 2017/6/23.
 */
public class EvaluatePostfix {
    public static void main(String[] args) {
        InfixToPostfix.main(null);
        String[] inStrings = InfixToPostfix.sOut.split(" ");

        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        for (String s : inStrings) {
            if      (s.equals("+"))     ops.push(s);
            else if (s.equals("-"))     ops.push(s);
            else if (s.equals("*"))     ops.push(s);
            else if (s.equals("/"))     ops.push(s);
            else if (s.equals("sqrt"))  ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("*"))    v = vals.pop() * v;
                else if (op.equals("/"))    v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}
