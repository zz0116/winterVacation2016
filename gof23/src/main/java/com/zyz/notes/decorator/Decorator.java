package com.zyz.notes.decorator;

/**
 * Created by ZhangYuanzhuo on 2017/1/17.
 */
public class Decorator implements Component {
    protected Component component;
    @Override
    public void operation() {
        if(component != null) {
            component.operation();
        }
    }
    public void setComponent(Component component) {
        this.component = component;
    }
}
