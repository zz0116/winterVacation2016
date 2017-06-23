package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.*;

import java.util.Arrays;

/**
 * Created by ZhangYuanzhuo on 2017/6/22.
 */
public class Q129 {
    /**
     * This class should not be instantiated.
     */
    private Q129() { }

    /**
     * Returns the index of the specified key in the specified array.
     *
     * @param  a the array of integers, must be sorted in ascending order
     * @param  key the search key
     * @param  counter the number of keys checked
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     */
    public static int indexOf(int[] a, int key, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            counter.increment();
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    /**
     * Returns the index of the specified key in the specified array.
     * This function is poorly named because it does not give the <em>rank</em>
     * if the array has duplicate keys or if the key is not in the array.
     *
     * @param  key the search key
     * @param  a the array of integers, must be sorted in ascending order
     * @param  counter the number of keys checked
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     * @deprecated Replaced by {@link #indexOf(int[], int, Counter)}.
     */
    @Deprecated
    public static int rank(int key, int[] a, Counter counter) {
        return indexOf(a, key, counter);
    }

    /**
     * Reads in a sequence of integers from the whitelist file, specified as
     * a command-line argument; reads in integers from standard input;
     * prints to standard output those integers that do <em>not</em> appear in the file.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        int N = StdIn.readInt();
        int[] whitelist = new int[N];
        for (int i = 0; i < N; i++) {
            whitelist[i] = StdIn.readInt();
        }

        // sort the array
        Arrays.sort(whitelist);

        // read integer key from standard input; print if not in whitelist
        while (!StdIn.isEmpty()) {
            Counter counter = new Counter("key checked");

            int key = StdIn.readInt();
            if (Q129.indexOf(whitelist, key, counter) == -1)
                StdOut.println(key);
            StdOut.println(counter);
        }

    }
}
