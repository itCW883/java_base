package com.ruirui;

import java.util.Scanner;

public class DeleteStudents {
    public static Students[] DeleteStudent(Students[] students){
        Scanner scanner=new Scanner(System.in);


           System.out.println("请输入要删除的学生姓名");
           String xueShen=scanner.next();

           int tag=0;
        for (int i = 0; i < students.length; i++) {
            if(students[i]!=null){
                if (students[i].getName().equals(xueShen)){
                    tag=i;
                }
            }

        }
        Students[] sTUs=new Students[students.length-1];
       System.arraycopy(students,0,sTUs,0,tag);
       System.arraycopy(students,tag+1,sTUs,tag,students.length-tag-1);
       students=sTUs;
       return students;
    }
}
