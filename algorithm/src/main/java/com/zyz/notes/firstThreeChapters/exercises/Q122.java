package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/6/21.
 */
public class Q122 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        Interval1D[] interval1Ds = new Interval1D[N];

        for (int n = 0; n < N; n++) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            interval1Ds[n] = new Interval1D(x, y);
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (interval1Ds[i].intersects(interval1Ds[j])) {
                    StdOut.println(interval1Ds[i] + " & " + interval1Ds[j]);
                }
            }
        }
    }
}
