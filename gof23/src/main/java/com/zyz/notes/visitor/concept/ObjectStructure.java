package com.zyz.notes.visitor.concept;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/2/9.
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }
}
