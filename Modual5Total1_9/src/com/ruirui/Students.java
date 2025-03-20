package com.ruirui;

public class Students {
    private String name;
    private int age;
    private double[] gard;

    public Students() {
    }

    public Students(double[] gard) {
        this.gard = gard;
    }

    public Students(int age) {
        this.age = age;
    }

    public Students(String name) {
        this.name = name;
    }

    public Students(String name, int age, double[] gard) {
        this.name = name;
        this.age = age;
        this.gard = gard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getGard() {
        return this.gard;
    }

    public void setGard(double[] gard) {
        this.gard = gard;
    }
}
