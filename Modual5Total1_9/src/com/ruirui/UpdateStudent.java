package com.ruirui;

import java.util.Scanner;

public class UpdateStudent {
    public static void UpdateStudents(Students[] students){
        System.out.println("=============学生信息更新功能=============");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要更新学生的姓名");
        String student=scanner.next();
        for (int i = 0; i < students.length; i++) {
            if(students[i]!=null){
                if(student.equals(students[i].getName())){
                    System.out.println("请问您需要更新该学生的什么信息呢");
                    int tag=0;
                    while (true){
                        System.out.println("需要修改姓名输入:1,修改年龄输入:2,修改成绩输入:3,退出功能输入:0");
                            switch (scanner.nextInt()){
                                case 1:
                                {
                                    String mZ= scanner.next();
                                    students[i].setName(mZ);
                                    System.out.println("还需要修改其他信息吗,需要输入0");
                                    break;
                                }
                                case 2:
                                {
                                    int age=scanner.nextInt();
                                    students[i].setAge(age);
                                    System.out.println("还需要修改其他信息吗,不需要输入0");
                                    break;
                                }
                                case 3:
                                {
                                    double gard[]=new double[3];
                                    for (int j = 0; j < 3; j++) {
                                        gard[j]=scanner.nextDouble();
                                    }
                                    students[i].setGard(gard);
                                    System.out.println("还需要修改其他信息吗,不需要输入0");
                                    break;
                                }
                                case 0:
                                    tag=1;
                                    break;
                            }
                    if(tag==1)break;
                    }

                }
                else System.out.println("查无此人哦,自动返回上一界面啦");
            }
        }

    }
}
