package com.Object;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("王城",22,true);
        System.out.println(person);//com.Object.Person@b4c966a
                                    // [因为没重写object类中的toString方法,直接输出对象名会默认调用object类中的toString方法]
        System.out.println(person.toString());
        //com.Object.Person@b4c966a
        /*此处依然为地址值的原因是:这里的toString方法是object类中的方法
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
               getClass().getName()代表包名.类名
               hashCode()返回一个十进制数
               Integer.toHexString()将括号中的数转为16进制
        * */
        System.out.println(person.getName());


        ArrayList<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("李氏");
        strings.add("王五");
        System.out.println(strings);//[张三, 李氏, 王五]
        System.out.println(strings.toString());//[张三, 李氏, 王五]
    }
}
