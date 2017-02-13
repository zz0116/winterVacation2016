package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.*;

/**
 * Created by ZhangYuanzhuo on 2017/2/11.
 */
public class TestConn {
    public TestConn(String textPath) {
        Graph G = new Graph(new In(textPath));
        CC cc = new CC(G);

        int M = cc.count();
        System.out.println(M + " components");

        Bag<Integer>[] components = new Bag[M];
        for (int i = 0; i < M; i++)
            components[i] = new Bag<>();
        for (int v = 0; v < G.V(); v++)
            components[cc.id(v)].add(v);
        for (int i = 0; i < M; i++) {
            for (int v: components[i])
                StdOut.print(v + " ");
            StdOut.println();
        }
    }
}
