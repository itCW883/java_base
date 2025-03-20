package com.cc;

public class employee {
    private String name;
    private int age;

    public employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public employee() {
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
    public void work(){
        System.out.println("工作");
    }
}
