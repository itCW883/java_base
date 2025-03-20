package com.ruirui.helloword;

import java.util.Arrays;

public class Demo01HelloWord {
    //alt+/  出现提示
    public static void main(String[] args) {
        System.out.println("Hello World");
        //alt+enter 导包,可以纠正错误,先写值可以自动生成变量(值.var自动生成变量)
        int i = (int) 10.0;
//    i = 10;
//    int i1 = 100;
//    int j = 100;
        //变量名.sout
        System.out.println(i);
        //ctrl+y 删除行
        //ctrl+d 复制当前行
        //CTRL+alt+l格式化当前代码
        //ctrl+shift+/多行注释
//        alt+shhift+上下键移动代码
        System.out.println(i);
        System.out.println(i);
        // //变量名.soutv 会带格式,带字符串拼接格式输出
        // soutv
        //算数运算符+ - * /(前后为整数则为整除) %(求模/取余数)
        System.out.println("i = " + i);
    }
}
