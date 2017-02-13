package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.DepthFirstSearch;
import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ZhangYuanzhuo on 2017/2/10.
 */
public class TestSearch {
    public TestSearch(String textPath, int start) {
        Graph G = new Graph(new In(textPath));
        DepthFirstSearch search = new DepthFirstSearch(G, start);

        for (int v = 0; v < G.V(); v++) {
            if (search.marked(v))
                StdOut.print(v + " ");
        }
        StdOut.println();

        if (search.count() != G.V())
            StdOut.print("NOT ");
        StdOut.println("connected");
    }

    public static void main(String[] args) {
//        TestSearch t1 = new TestSearch("E:\winterVacation\algorithm\src\main\resources\tinyG.txt", 0);
//        TestSearch t2 = new TestSearch("E:\winterVacation\algorithm\src\main\resources\tinyG.txt", 9);

//        TestSearch t3 = new TestSearch("E:\\winterVacation\\algorithm\\src\\main\\resources\\tinyCG.txt", 0);

//        TestSearch t4 = new TestSearch(
//                "E:\\winterVacation\\algorithm\\src\\main\\resources\\tinyGex2.txt",
//                4);
    }
}
