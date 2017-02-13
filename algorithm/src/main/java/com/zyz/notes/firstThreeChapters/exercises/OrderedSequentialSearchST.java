package com.zyz.notes.firstThreeChapters.exercises;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class OrderedSequentialSearchST<Key extends Comparable<Key>, Value> {
    private Node first;

    private class Node {
        Key key;
        Value val;
        Node next;
        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public Value get(Key key) {
        for(Node x = first; x != null; x = x.next) {
            if(key.equals(x.key))
                return x.val;
        }
        return null;
    }

    public void put(Key key, Value val) {
        if (first == null)
            first = new Node(key, val, null);
        else if (first.next == null) {
            int cmp1 = key.compareTo(first.key);
            if(cmp1<0) first = new Node(key, val, first);
            else if(cmp1>0) first.next = new Node(key, val, null);
            else first.val = val;
            return;
        }
        Node x, y;
        for(x = first, y = first.next; y != null; x = x.next, y = y.next) {
            int cmp1 = key.compareTo(x.key);
            int cmp2 = key.compareTo(y.key);
            if (cmp1 == 0) {
                x.val = val;
                return;
            }else if (cmp1<0 && cmp2>0) {
                x.next = new Node(key, val, y);
                return;
            }
        }
        x.next = new Node(key, val, null);
    }
}
