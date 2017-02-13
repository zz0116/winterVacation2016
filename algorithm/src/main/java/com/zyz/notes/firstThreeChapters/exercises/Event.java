package com.zyz.notes.firstThreeChapters.exercises;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public class Event {
    private String event;

    public Event(String event) {
        this.event = event;
    }

    public Event() {
        this("");
    }

    public int compareTo(Event other) {
        return event.compareTo(other.event);
    }
}
