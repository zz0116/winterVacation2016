package com.zyz.notes.resume;

import com.zyz.notes.calculator2.Operation;

/**
 * Created by ZhangYuanzhuo on 2017/1/20.
 */
public class Resume implements Cloneable {
    private String name;
    private String gender;
    private int age;
    private WorkExperience workExperience = new WorkExperience();

    public Resume() {}

    public Resume(WorkExperience workExperience) {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                '}';
    }

    @Override
    public Object clone() {
        Resume clone = new Resume(this.workExperience);
        clone.setName(this.name);
        clone.setGender(this.gender);
        clone.setAge(this.age);
        return clone;
    }
}
