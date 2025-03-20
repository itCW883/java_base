package com.ruirui;

public class FindStudents {
    public static void FindStudents(Students[] students){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.printf("该学生姓名是"+students[i].getName());
                System.out.printf("  年龄是:"+students[i].getAge());
                double[] Cj = new double[3];
                Cj = students[i].getGard();
                System.out.printf("  成绩是:");
                for (int j = 0; j < 3; j++) {
                    System.out.printf(Cj[j]+" ");
                }
            }
            else break;
            System.out.println();
        }
    }
}
