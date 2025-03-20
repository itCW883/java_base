package com.ruirui;

import java.util.Scanner;

public class AddStudents {

 public static Students[] AddStudents(int count,Students[] students){

     System.out.println("++++++++++++添加功能+++++++++++++");
     System.out.println("++++++++++++请输入需要添加学生的个数+++++++++++++");
     Scanner scanner=new Scanner(System.in);
     int addStuQTY=scanner.nextInt();
     for (int i = count; i < count+addStuQTY; i++) {
         students[i]=new Students();
         System.out.println("请输入学生姓名");
         String name=scanner.next();
         students[i].setName(name);
         System.out.println("请输入学生年龄");
         int age=scanner.nextInt();
         students[i].setAge(age);
         System.out.println("请按顺序输入语文,数学,英语成绩");
         double gard[]=new double[3];
         for (int j = 0; j < 3; j++) {
            gard[j]=scanner.nextDouble();
         }
         students[i].setGard(gard);
     }
return students;
 }
}
