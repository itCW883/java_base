package com.DuiXiangShuZ;

public class Student {
    private String name;
    private double gard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGard() {
        return gard;
    }

    public void setGard(double gard) {
        this.gard = gard;
    }

    public Student(String name, double gard) {
        this.name = name;
        this.gard = gard;
    }

    public Student() {
    }
}
