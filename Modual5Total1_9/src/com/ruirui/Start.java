package com.ruirui;

import java.util.Scanner;

public class Start {
    public static void Start(){
        Scanner input =new Scanner(System.in);
        int count=0;
        Students[]students=new Students[90];
        while(true){
            System.out.println("-------------学生管理系统---------------");
            System.out.println("1.添加学生");
            System.out.println("2.修改学生");
            System.out.println("3.删除学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            int shuRu= input.nextInt();
            switch (shuRu){
                case 1:
                    students= AddStudents.AddStudents(count,students);
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                             count += 1;
                        }
                    }
                    break;
                case 2:
                    UpdateStudent.UpdateStudents(students);
                    break;
                case 3:
                    students= DeleteStudents.DeleteStudent(students);
                    break;
                case 4:
                    FindStudents.FindStudents(students);
                    break;
                case 5:break;

            }
            if(shuRu==5){
                System.out.println("确定退出吗???确定请输入:1;取消请按任意键");
                int exit=input.nextInt();
                if(exit==1){
                    System.out.println("您已经退出程序啦!!!!");
                    break;
                }
            }

        }
    }
}
