package com.ClassicalIterface.Comparator;

import java.util.Comparator;

public class Person implements Comparator {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Person&&o2 instanceof Person){
            Person p1=(Person) o1;
            Person p2=(Person) o2;
            return p1.age-p2.age;
        }
        return 0;
    }
}
