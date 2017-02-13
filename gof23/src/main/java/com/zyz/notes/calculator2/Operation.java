package com.zyz.notes.calculator2;

/**
 * Created by ZhangYuanzhuo on 2017/1/14.
 */
public class Operation {
    private double numberA;
    private double numberB;
    private double result;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult() throws Exception {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
