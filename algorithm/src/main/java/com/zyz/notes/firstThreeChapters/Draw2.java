package com.zyz.notes.firstThreeChapters;

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by ZhangYuanzhuo on 2017/1/18.
 */
public class Draw2 {
    public static void main(String[] args) {
        int N = 50;
        double[] a = new double[N];
        for(int i=0; i<N; i++)
            a[i] = StdRandom.random();
        for(int i=0; i<N; i++) {
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
