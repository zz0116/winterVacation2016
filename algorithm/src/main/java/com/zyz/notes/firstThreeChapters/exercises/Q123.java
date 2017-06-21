package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.*;

/**
 * Created by ZhangYuanzhuo on 2017/6/21.
 */
public class Q123 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        double min = StdIn.readDouble();
        double max = StdIn.readDouble();
        Interval2D[] interval2Ds = new Interval2D[N];

        for (int n = 0; n < N; n++) {
            double xlo = StdRandom.uniform(min, max);
            double xhi = StdRandom.uniform(min, max);
            if (xlo > xhi) {
                double tmp = xlo;
                xlo = xhi;
                xhi = tmp;
            }

            double ylo = StdRandom.uniform(min, max);
            double yhi = StdRandom.uniform(min, max);
            if (ylo > yhi) {
                double tmp = ylo;
                ylo = yhi;
                yhi = tmp;
            }

            interval2Ds[n] = new Interval2D(new Interval1D(xlo, xhi), new Interval1D(ylo, yhi));
            interval2Ds[n].draw();
        }

        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (interval2Ds[i].intersects(interval2Ds[j])) {
                    count++;
                }
            }
        }

        StdOut.println("number of intersection: " + count);
    }
}
