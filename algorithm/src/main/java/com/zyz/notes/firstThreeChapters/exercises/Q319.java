package com.zyz.notes.firstThreeChapters.exercises;

/**
 * Created by ZhangYuanzhuo on 2017/2/9.
 */
public class Q319 {
    public static void main(String[] args) {
        FCounter FCounter1 = new FCounter("E:\\winterVacation\\algorithm\\src\\main\\resources\\tale.txt", 1);
        FCounter1.getLastPut();

        FCounter FCounter8 = new FCounter("E:\\winterVacation\\algorithm\\src\\main\\resources\\tale.txt", 8);
        FCounter8.getLastPut();

        FCounter FCounter10 = new FCounter("E:\\winterVacation\\algorithm\\src\\main\\resources\\tale.txt", 10);
        FCounter10.getLastPut();
    }
}
