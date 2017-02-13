package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;

/**
 * Created by ZhangYuanzhuo on 2017/2/13.
 */
public class Q4113 {
    private Graph G;
    private int dist = 0;

    public Q4113(String textPath) {
        G = new Graph(new In(textPath));
    }

//    public int distTo(int s, int e) {
//
//    }

    public static void main(String[] args) {
        Graph G = new Graph(new In("E:\\winterVacation" +
                "\\algorithm\\src\\main" +
                "\\resources\\Q4112.txt"));

    }
}
