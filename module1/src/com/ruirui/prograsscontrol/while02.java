package com.ruirui.prograsscontrol;

public class while02 {
    public static void main(String[] args) {
        int count=0;
        int mountsin=8844430;
        double paper=0.1;
        while (paper<mountsin){
            paper=paper*2;
            count++;
        }
        System.out.println("count = " + count);
    }
}
