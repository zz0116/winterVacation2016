package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.BreadthFirstPaths;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;

/**
 * Created by ZhangYuanzhuo on 2017/2/12.
 */
public class Q4111 {
//    private Graph G;
//    private BreadthFirstPaths BFS;
//
//    public Q4111(String textPath, int s) {
//        G = new Graph(new In(textPath));
//        BFS = new BreadthFirstPaths(G, s);
//    }

    public static void main(String[] args) {
//        Q4111 t = new Q4111("E:\\winterVacation\\algorithm" +
//                "\\src\\main\\resources\\tinyGex2.txt", 0);
        args = new String[2];
        args[0] = "E:\\winterVacation\\algorithm" +
                "\\src\\main\\resources\\tinyGex2.txt";
        args[1] = "0";
        BreadthFirstPaths.main(args);
    }
}
