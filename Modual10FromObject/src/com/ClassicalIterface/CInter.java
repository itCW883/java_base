package com.ClassicalIterface;

public class CInter {
    public static void main(String[] args) {
        Person[] p=new Person[3];
        p[0]= new Person("wc", 22);
        p[1]= new Person("lr", 20);
        p[2] = new Person("cxt", 2);
        Person person = new Person();
        for (int i = 0; i < p.length-1; i++) {
            for (int j = 0; j < p.length -1- i; j++) {
                if(p[j].compareTo(p[j+1])>0){
                    person=p[j+1];
                    p[j+1]=p[j];
                    p[j]=person;
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}
