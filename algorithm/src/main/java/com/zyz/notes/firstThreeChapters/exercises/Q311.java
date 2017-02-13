package com.zyz.notes.firstThreeChapters.exercises;

import com.zyz.notes.firstThreeChapters.BinarySearchST;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public class Q311 {
    private Double result = 0.0;
    private BinarySearchST<String, Double> gpa;

    public Q311() {
        gpa = new BinarySearchST<>(11);
        gpa.put("A+", 4.33);
        gpa.put("A", 4.00);
        gpa.put("A-", 3.67);
        gpa.put("B+", 3.33);
        gpa.put("B", 3.00);
        gpa.put("B-", 2.67);
        gpa.put("C+", 2.33);
        gpa.put("C", 2.00);
        gpa.put("C-", 1.67);
        gpa.put("D", 1.00);
        gpa.put("F", 0.00);
    }

    public double getResult(String[] letter) {
        for(String l: letter) {
            result += gpa.get(l);
        }
        return result/letter.length;
    }

    public static void main(String[] args) {
        Q311 q311 = new Q311();
        StdOut.printf("%.2f",q311.getResult(args));
    }
}
