package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;

/**
 * Created by ZhangYuanzhuo on 2017/2/10.
 */
public class Construct {
    public static void main(String[] args) {
        Graph g = new Graph(
                new In("E:\\winterVacation\\" +
                        "algorithm\\src\\main\\" +
                        "resources\\tinyGex2.txt"));
        System.out.println(g.toString());

//        Graph g = new Graph(
//                new In("E:\\winterVacation\\" +
//                        "algorithm\\src\\main\\" +
//                        "resources\\tinyGex2.txt"));
//        System.out.println(g.toString());

//        Graph g = new Graph(new In("E:\\winterVacation\\algorithm\\src\\main\\resources\\tinyG.txt"));
//        System.out.println(g.toString());
    }
}
