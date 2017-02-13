package com.zyz.notes.firstThreeChapters;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ZhangYuanzhuo on 2017/2/5.
 */
public class FrequencyCounter {
    public static void main(String[] args) {
        int minlen = Integer.parseInt(args[0]);
        ST<String, Integer> st = new ST<>();

        for(int i=1; i<args.length; i++) {
            String word = args[i];
            if(word.length()<minlen)
                continue;
            if(!st.contains(word))
                st.put(word, 1);
            else
                st.put(word, st.get(word)+1);
        }

        String max = " ";
        st.put(max, 0);

        for(String word: st.keys()) {
            if(st.get(word)>st.get(max))
                max = word;
        }

        StdOut.println(max+" "+st.get(max));
    }
}
