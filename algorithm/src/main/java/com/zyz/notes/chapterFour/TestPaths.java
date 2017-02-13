package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.DepthFirstPaths;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/2/10.
 */
public class TestPaths {
    public TestPaths(String textPath, int start) {
        Graph G = new Graph(new In(textPath));
        DepthFirstPaths search = new DepthFirstPaths(G, start);
        for (int v = 0; v < G.V(); v++) {
            System.out.println(start + " to " + v + ": ");
            if (search.hasPathTo(v)) {
                for (int x : search.pathTo(v)) {
                    if (x == start) StdOut.print(x);
                    else StdOut.print("-" + x);
                }
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        TestPaths t2 = new TestPaths(
                "E:\\winterVacation\\algorithm\\src\\main\\resources\\tinyGex2.txt",
                0);

//        TestPaths t1 = new TestPaths(
//                "E:\\winterVacation\\algorithm\\src\\main\\resources\\tinyCG.txt",
//                0);
    }
}
