package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/6/21.
 */
public class Q121 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];

        for (int n = 0; n < N; n++) {
            double x = Math.random();
            double y = Math.random();
            points[n] = new Point2D(x, y);
            points[n].draw();
        }

        double minDistance = Double.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                double distance = points[i].distanceTo(points[j]);
                if (minDistance > distance) {
                    minDistance = distance;
                }
            }
        }

        StdOut.println(minDistance);
    }
}
