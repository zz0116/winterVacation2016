package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.ST;

import java.util.Random;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Q317 {
    private ST<Integer, Integer> st;

    public ST<Integer, Integer> getSt() {
        return st;
    }

    public void frequencyCounter(int[] ints) {
        st = new ST<>();

        for(int i=0; i<ints.length; i++) {
            int item = ints[i];
            if(!st.contains(item))
                st.put(item, 1);
            else
                st.put(item, st.get(item)+1);
        }
    }

    public int[] generate(int N) {
        int[] ret = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            ret[i] = random.nextInt(1000);
        }
        return ret;
    }

    public int q317(int N) {
        int redo = 100;
        int ret = 0;
        for (int i = 0; i < redo; i++) {
            frequencyCounter(generate(N));
            ret += st.size();
        }
        return ret/redo;
    }

    public static void main(String[] args) {
        Q317 q = new Q317();
//        q.q317(10);
//        q.q317((int) Math.pow(10, 2));
//        q.q317((int) Math.pow(10, 3));
//        q.q317((int) Math.pow(10, 4));
//        q.q317((int) Math.pow(10, 5));
        q.q317((int) Math.pow(10, 6));
        System.out.println(q.getSt().size());
    }
}
