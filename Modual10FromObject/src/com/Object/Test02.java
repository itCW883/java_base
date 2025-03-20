package com.Object;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        Person person3 = new Person("王城", 22, true);
        Person person1 = new Person("李锐", 20, false);
        Person person2 = new Person("王城", 22, true);
        System.out.println(person2.equals(person3));//在Object类中;equals方法比较两个对象的地址值是否相等

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));
        ArrayList arrayList = new ArrayList();
        System.out.println(s2.equals(arrayList));
    }
}
