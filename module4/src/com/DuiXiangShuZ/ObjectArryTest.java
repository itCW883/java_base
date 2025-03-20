package com.DuiXiangShuZ;

import java.util.Scanner;

public class ObjectArryTest {
    public static void main(String[] args) {
//        Student[] students=new Student[3];
//        students[0]=new Student("李锐",90);
//        students[1]=new Student("王城",80);
//        students[2]=new Student("李小狗",99);
        Student[] students = SLH(3);
       Student[] result= ChenJiBiao(students);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getName()+"的成绩是"+result[i].getGard());
        }
    }
    public static Student[] ChenJiBiao(Student[] arry){
        for (int i = 0; i < arry.length-1; i++) {
            Student[] cj=new Student[1];
            for (int j = 0; j < i-j; j++) {
                if(arry[j].getGard()>arry[j+1].getGard()){
                   cj[0]=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=cj[0];

                }
            }
        }
        return arry;
    }
    public static Student[] SLH(int arry){
        Student[] student=new Student[arry];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arry; i++) {
           student[i].setName(scanner.nextLine());
            student[i].setGard(scanner.nextDouble());
        }
        return student;
    }
}
