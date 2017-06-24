package com.zyz.notes.firstThreeChapters.exercises.q1317;

import edu.princeton.cs.algs4.*;

import java.util.Arrays;

/**
 * Created by ZhangYuanzhuo on 2017/6/24.
 */
public class Transaction {
    private String client;
    private Date date;
    private double money;

    public Transaction(String transaction) {
        String[] fields = transaction.split(" ");
        client = fields[0];
        date = new Date(fields[1]);
        money = Double.parseDouble(fields[2]);
    }

    public static Transaction[] readTransactions(String transactions) {
        In in = new In(transactions);
        Queue<Transaction> q = new Queue<>();
        while (in.hasNextLine()) {
            q.enqueue(new Transaction(in.readLine()));
        }

        int N = q.size();
        Transaction[] t = new Transaction[N];
        for (int i = 0; i < N; i++) {
            t[i] = q.dequeue();
        }
        return t;
    }

    @Override
    public String toString() {
        return "CLIENT:" + client + " DATE:" + date + " MONEY:" + money;
    }

    public static void main(String[] args) {
        StdOut.println(Arrays.toString(Transaction.readTransactions("E:\\winterVacation2016\\algorithm\\src\\main\\java\\com\\zyz\\notes\\firstThreeChapters\\exercises\\q1317\\transaction.dat")));
    }
}
