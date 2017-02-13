package com.zyz.notes.firstThreeChapters;

/**
 * Created by ZhangYuanzhuo on 2017/2/6.
 */
public class SequentialSearchST<Key, Value> {
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
        for(Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        first = new Node(key, val, first);
    }

    public int size() {
        int n = 0;
        for(Node x = first; x != null; x = x.next) {
            n++;
        }
        return n;
    }

    public void delete(Key key) throws Exception {
        if (first == null) {
            throw new Exception("the set is empty!");
        }else if (first.next == null) {
            if (key.equals(first.key)) {
                first = null;
                return;
            }
        }
        Node x, y;
        for (x = first, y = first.next; y != null; x = x.next, y = y.next) {
            if(x==first && key.equals(x.key)) {
                first = y;
                return;
            }
            if(key.equals(y.key)) {
                x.next = y.next;
                return;
            }
        }
        throw new Exception("the key not exist!");
    }

    public Object[] keys() {
        Object[] ret = new Object[size()];
        int i = 0;
        for (Node x = first; x != null; x = x.next) {
            ret[i] = x.key;
            i++;
        }
        return ret;
    }
}
