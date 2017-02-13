package com.zyz.notes.resume;

/**
 * Created by ZhangYuanzhuo on 2017/1/20.
 */
public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
