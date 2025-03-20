package com.ruirui.scanner;
import java.util.Scanner;//导入scaner
public class scanner {
    public static void main(String[] args) {
        System.out.println("scanner");
        /*使用java类
         * 1.导包:导包位置再类(public class scanner)上
         * 2.创建对象
         * 3.调用录入方法*/
        //创建对象
        Scanner scanner = new Scanner(System.in);//System.in表示标准输入
        /*
         * nextInt输入整型
         * next输入字符串string*/
        int i = scanner.nextInt();
        System.out.println(i);
        //next
        // scanner.next()遇见空格和回车就结束录入;
        String s = scanner.next();
        System.out.println(s);
        //nextline()遇见回车才会结束空格不会结束和nextline连用,若next用空格结束,nextline会接受前面next结束的空格
        String s1 = scanner.nextLine();
        System.out.println("s1 = " + s1);

    }
}
