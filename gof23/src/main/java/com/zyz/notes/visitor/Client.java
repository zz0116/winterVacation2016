package com.zyz.notes.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/2/8.
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success v1 = new Success();
        o.display(v1);

        Failing v2 = new Failing();
        o.display(v2);

        Amativeness v3 = new Amativeness();
        o.display(v3);
    }
}
