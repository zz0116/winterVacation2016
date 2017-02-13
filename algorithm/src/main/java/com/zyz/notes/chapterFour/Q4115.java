package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;

/**
 * Created by ZhangYuanzhuo on 2017/2/13.
 */
public class Q4115 {
    private static final String NEWLINE = System.getProperty("line.separator");

    private int V;
    private int E;
    private Bag<Integer>[] adj;

    public Q4115(In in) {
        String[] firstLine = in.readLine().split(" ");
        V = Integer.parseInt(firstLine[0]);
        int E = Integer.parseInt(firstLine[2]);

        if (V < 0) throw new IllegalArgumentException("number of vertices in a Graph must be nonnegative");
        if (E < 0) throw new IllegalArgumentException("number of edges in a Graph must be nonnegative");

        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }

        for (int v = 0; v < V; v++) {
            String[] perLine = in.readLine().split(" ");
            for (int i = perLine.length-1; i>=1; i--) {
                addEdge(v, Integer.parseInt(perLine[i]));
            }
        }
        this.E /= 2;
    }

    public void addEdge(int v, int w) {
        E++;
        adj[v].add(w);
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int degree(int v) {
        return adj[v].size();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + NEWLINE + E + NEWLINE);
        for (int v = 0; v < V; v++) {
            for (int w : adj[v]) {
                s.append(v + " ");
                s.append(w);
                s.append(NEWLINE);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Q4115 q4115 = new Q4115(new In("E:\\winterVacation\\algorithm\\src\\main\\resources\\Q4115.txt"));
//        System.out.println(q4115.V);
//        System.out.println(q4115.E);
        System.out.println(q4115);
    }
}
