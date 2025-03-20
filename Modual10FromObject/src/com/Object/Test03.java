package com.Object;

public class Test03 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("王城", 20, true);
        Object p2 = person.clone();
        Person p3=(Person) p2;
        System.out.println(p3 == person);
        System.out.println(person.equals(p3));
    }
}
