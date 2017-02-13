package com.zyz.notes.component;

/**
 * Created by ZhangYuanzhuo on 2017/2/3.
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        while (depth-->0) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
