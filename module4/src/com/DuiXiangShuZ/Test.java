package com.DuiXiangShuZ;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arry=scanner.nextInt();
        Student[] student=new Student[arry];
        for (int i = 0; i < arry; i++) {
            student[i].setName(scanner.next());
            student[i].setGard(scanner.nextDouble());
        }


    }
}
