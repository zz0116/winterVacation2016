package com.zyz.notes.cashRigister;

/**
 * Created by ZhangYuanzhuo on 2017/1/15.
 */
public class User {
    private double unitPrice;
    private int amount;
    private double total;
    private CashContext cc;

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = cc.getResult(this.unitPrice*this.amount);
    }
}
