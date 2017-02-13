package com.zyz.notes.personBuilder;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ZhangYuanzhuo on 2017/1/24.
 */
public class Pen {
    JFrame j = new JFrame("PB");
    public Pen() {
        j.setSize(200, 300);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void add(Component c) {
        j.add(c);
    }
}
