package com.zyz.notes.firstThreeChapters.exercises;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdOut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ZhangYuanzhuo on 2017/2/9.
 */
public class FCounter {
    private ST<String, Integer> st;
    private String lastPut;
    private int cntBeforeLastPut;
    private int minLen;

    public FCounter(String textName, int minLen) {
        cntBeforeLastPut = 0;
        this.minLen = minLen;
        st = new ST<>();
        List<String> list = readText(textName);

        for(int i=1; i<list.size(); i++) {
            String word = list.get(i);
            if(word.length()<minLen)
                continue;
            if(!st.contains(word)) {
                st.put(word, 1);
                cntBeforeLastPut++;
                lastPut = word;
            }else {
                st.put(word, st.get(word) + 1);
            }
        }
    }

    private List<String> readText(String textName) {
        File file = new File(textName);
        BufferedReader reader;
        StringBuilder buffer = new StringBuilder();
        String line;
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine())!=null) {
                buffer.append(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern compile = Pattern.compile("[a-zA-Z]+");
        String lowerCase = buffer.toString().toLowerCase();
        Matcher matcher = compile.matcher(lowerCase);

        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }

    public void getMax() {
        String max = " ";
        st.put(max, 0);

        for(String word: st.keys()) {
            if(st.get(word)> st.get(max))
                max = word;
        }

        StdOut.println("the max-used word is(length>"+minLen+"): "+max+", and used "+ st.get(max)+" times");
    }

    public void getAllMax() {
        Queue<String> q = new Queue<>();
        String max = " ";
        st.put(max, 0);


        for(String word: st.keys()) {
            int cmp = st.get(word)- st.get(max);
            if(cmp>0) {
                q = new Queue<>();
                max = word;
                q.enqueue(word);
            }else if(cmp==0) {
                q.enqueue(word);
            }
        }

        System.out.println("the max-used words are(length>" + minLen + "): ");
        while (!q.isEmpty()) {
            StdOut.print(q.dequeue()+" ");
        }
    }

    public void getLastPut() {
        System.out.println("the last put-in word is: " + lastPut+", and has been put "+cntBeforeLastPut+" words");
    }
}
