package com.zyz.notes.chapterFour;

import edu.princeton.cs.algs4.DegreesOfSeparation;

/**
 * Created by ZhangYuanzhuo on 2017/2/11.
 */
public class TestDOS {
    public TestDOS(String textPath, String delimiter, String source) {
        String args[] = {textPath, delimiter, source};
        DegreesOfSeparation.main(args);
    }

    public static void main(String[] args) {
//        TestDOS t1 = new TestDOS("E:\winterVacation\algorithm\src\main\resources\movies-hero.txt",
//                "/",
//                "Bacon, Kevin");

        TestDOS t2 = new TestDOS("E:\\winterVacation\\algorithm\\src\\main\\resources\\routes.txt",
                " ",
                "JFK");
    }
}
