package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.BreadthFirstPaths;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;

/**
 * Created by ZhangYuanzhuo on 2017/2/13.
 */
public class Q4112 {
    public static void main(String[] args) {
        Graph G = new Graph(new In("E:\\winterVacation" +
                "\\algorithm\\src\\main" +
                "\\resources\\Q4112.txt"));
        BreadthFirstPaths BFS = new BreadthFirstPaths(G, 3);
        System.out.println(BFS.distTo(4));
    }
}
