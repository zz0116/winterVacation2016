package com.zyz.notes.firstThreeChapters.exercises;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public class Time {
    private String time;

    public Time(String time) {
        this.time = time;
    }

    public Time() {
        this("00:00:00");
    }

    private int hour() {
        return Integer.parseInt(time.substring(0, 2));
    }

    private int minute() {
        return Integer.parseInt(time.substring(3, 5));
    }

    private int second() {
        return Integer.parseInt(time.substring(6, 8));
    }

    public int compareTo(Time other) {
        if(hour()<other.hour()) {
            return -1;
        }else if(hour()>other.hour()) {
            return 1;
        }
        if(minute()<other.minute()) {
            return -1;
        }else if(minute()>other.minute()) {
            return 1;
        }
        if(second()<other.second()) {
            return -1;
        }else if(second()>other.second()) {
            return 1;
        }
        return 0;
    }
}
