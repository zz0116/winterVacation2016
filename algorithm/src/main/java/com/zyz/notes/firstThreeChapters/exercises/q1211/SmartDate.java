package com.zyz.notes.firstThreeChapters.exercises.q1211;

import edu.princeton.cs.algs4.Date;

/**
 * Created by ZhangYuanzhuo on 2017/6/22.
 */
public class SmartDate {
    private static final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private int month;
    private int day;
    private int year;

    public SmartDate(int month, int day, int year) {
        if (!isValid(month, day, year)) throw new IllegalArgumentException("Invalid date");
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public SmartDate(String date) {
        String[] fields = date.split("/");
        if (fields.length != 3) {
            throw new IllegalArgumentException("Invalid date");
        }
        month = Integer.parseInt(fields[0]);
        day   = Integer.parseInt(fields[1]);
        year  = Integer.parseInt(fields[2]);
        if (!isValid(month, day, year)) throw new IllegalArgumentException("Invalid date");
    }

    // Date类的实现就已经很好了呀？

    private boolean isValid(int m, int d, int y) {
        if (m < 1 || m > 12)      return false;
        if (d < 1 || d > DAYS[m]) return false;
        if (m == 2 && d == 29 && !isLeapYear(y)) return false;
        return true;
    }

    private boolean isLeapYear(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        return y % 4 == 0;
    }
}
