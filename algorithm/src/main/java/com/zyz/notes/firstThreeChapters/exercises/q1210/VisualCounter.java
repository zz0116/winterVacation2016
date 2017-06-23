package com.zyz.notes.firstThreeChapters.exercises.q1210;

import edu.princeton.cs.algs4.*;

/**
 * Created by ZhangYuanzhuo on 2017/6/22.
 */
public class VisualCounter implements Comparable<Counter> {
    private int N;
    private int max;
    private int count = 0;         // current value

    /**
     * Initializes a new counter starting at 0, with the given id.
     *
     * @param N the max times of operation
     * @param max the max abs of counter
     */
    public VisualCounter(int N, int max) {
        this.N = N;
        this.max = max;
    }

    /**
     * Increments the counter by 1.
     */
    public void increment() {
        if (tally() < max) {
            count++;
        }
    }

    /**
     * decrease the counter by 1
     */
    public void decrease() {
        if (-tally() < max) {
            count--;
        }
    }

    /**
     * operate the counter
     */
    public void operate() {
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(-max, max);
        for (int i = 0; i < N; i++) {
            int oldCounter = tally();
            if (StdRandom.random() < 0.5) {
                increment();
            }else {
                decrease();
            }
            if (i > 0) {
                StdDraw.line(i - 1, oldCounter, i, tally());
            }
        }
    }

    /**
     * Returns the current value of this counter.
     *
     * @return the current value of this counter
     */
    public int tally() {
        return count;
    }

    /**
     * Compares this counter to the specified counter.
     *
     * @param  that the other counter
     * @return {@code 0} if the value of this counter equals
     *         the value of that counter; a negative integer if
     *         the value of this counter is less than the value of
     *         that counter; and a positive integer if the value
     *         of this counter is greater than the value of that
     *         counter
     */
    @Override
    public int compareTo(Counter that) {
        if      (this.count < that.tally()) return -1;
        else if (this.count > that.tally()) return +1;
        else                              return  0;
    }


    /**
     * Reads two command-line integers n and trials; creates n counters;
     * increments trials counters at random; and prints results.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        VisualCounter counter = new VisualCounter(StdIn.readInt(), StdIn.readInt());
        counter.operate();
    }
}
