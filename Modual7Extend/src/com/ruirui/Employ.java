package com.ruirui;

public class Employ {
     String gongzuo;
     String name;

    public Employ() {
    }

    private int age;

    public Employ(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employ(String gongzuo, String name, int age) {
        this.gongzuo = gongzuo;
        this.name = name;
        this.age = age;
    }

    public String getGongzuo() {
        return gongzuo;
    }

    public void setGongzuo(String gongzuo) {
        this.gongzuo = gongzuo;
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

    public static void work(String gongzuo, String name, int age){
        System.out.println(age + "的员工" + name + "的工作是" + gongzuo+"打螺丝");

    }
    private static void eat(){
        System.out.println("员工不是机器,需要休息");
    }
}
