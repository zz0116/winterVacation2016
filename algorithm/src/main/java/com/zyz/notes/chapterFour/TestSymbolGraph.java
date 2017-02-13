package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.SymbolGraph;

/**
 * Created by ZhangYuanzhuo on 2017/2/11.
 */
public class TestSymbolGraph {
    public TestSymbolGraph(String filename, String delim) {
        SymbolGraph sg = new SymbolGraph(filename, delim);

        Graph G = sg.graph();
        while (StdIn.hasNextLine()) {
            String source = StdIn.readLine();
            for (int w: G.adj(sg.indexOf(source))) {
                StdOut.println("   "+sg.nameOf(w));
            }
        }
    }

    public static void main(String[] args) {
        TestSymbolGraph t1 = new TestSymbolGraph("E:\\winterVacation\\algorithm\\src\\main\\resources\\movies-hero.txt", "/");
    }
}
