package com.zyz.notes.firstThreeChapters.exercises.q1314;

import java.util.Iterator;

/**
 * Created by ZhangYuanzhuo on 2017/6/24.
 */
public class ResizingArrayQueueOfStrings<T> implements Iterable<T> {
    private T[] a = (T[]) new Object[1];
    private int N = 0;
    public boolean isEmpty() {
        return N == 0;
    }
    public int size() {
        return N;
    }
    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
    public void enqueue(T t) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = t;
    }
    public T dequeue() {
        T t = a[0];
        for (int i = 0; i < N - 1; i++) {
            a[i] = a[i + 1];
        }
        a[N] = null;
        if (N > 0 && N == a.length/4) {
            resize(a.length/2);
        }
        return t;
    }

    @Override
    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<T> {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < N;
        }

        @Override
        public T next() {
            return a[i++];
        }
    }
}
