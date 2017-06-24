package com.zyz.notes.firstThreeChapters.exercises.q1316;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by ZhangYuanzhuo on 2017/6/24.
 */
public class Date {
    private int month;
    private int day;
    private int year;

    public Date(String date) {
        String[] fields = date.split("/");
        month = Integer.parseInt(fields[0]);
        day = Integer.parseInt(fields[1]);
        year = Integer.parseInt(fields[2]);
    }

    public static Date[] readDates(String dates) {
        String[] datesList = dates.split(" ");
        Date[] list = new Date[datesList.length];

        int i = 0;
        for (String date : datesList) {
            list[i++] = new Date(date);
        }
        return list;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }

    public static void main(String[] args) {
        StdOut.println(Arrays.toString(Date.readDates(StdIn.readLine())));
    }
}
