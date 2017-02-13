package com.zyz.notes.firstThreeChapters.exercises;

/**
 * Created by ZhangYuanzhuo on 2017/2/7.
 */
public class ArrayST<Key extends Comparable<Key>, Value> {
    private Key[] keys;
    private Value[] vals;
    private int N = 0;

    public ArrayST(int capacity) {
        keys = (Key[]) new Comparable[capacity];
        vals = (Value[]) new Object[capacity];
    }

    public int size() {
        return N;
    }

    public Value get(Key key) {
        if(isEmpty()) return null;
        int i = rank(key);
        if(i<N && keys[i].compareTo(key)==0) return vals[i];
        else return null;
    }

    private boolean isEmpty() {
        return keys.length==0;
    }

    public int rank(Key key) {
        int lo = 0, hi = N-1;
        while (lo<=hi) {
            int mid = lo + (hi - lo)/2;
            int cmp = key.compareTo(keys[mid]);
            if(cmp<0) hi = mid - 1;
            else if(cmp>0) lo = mid + 1;
            else return mid;
        }
        return lo;
    }
}
