package com.InternalClass.IneerClass02;

public class Test03 {
    public static void main(String[] args) {
        Person person = new Person();
        Methoud01(person);
        System.out.println("================");
        Person p2=Methoud02();
        p2.eat();
    }
    public static void Methoud01(Person person){
        person.eat();
    }
    public static Person Methoud02(){
       /* Person person = new Person();
        return person;*/
        return new Person();
    }
}
