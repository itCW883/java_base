package StringBuilder.StringBuilder;

import java.util.Scanner;

public class StringBuilderPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符串");
        String s = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder reverse = stringBuilder.reverse();
        String sb2 = reverse.toString();
        if(s.equals(sb2)){
            System.out.println("是回文格式");
        }
        else
            System.out.println("不是回文格式");

    }
}
