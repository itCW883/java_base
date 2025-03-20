package com.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo01 {
    public static void main(String[] args) throws ParseException {
        //Method();//StackOverflowError
        //int[] arry=new int[3];
        //System.out.println(arry[3]);//运行时期异常ArrayIndexOutOfBoundsException
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");//SimpleDateFormat日期格式化类
        String time="2000-10-10 10:10:10";
        Date date = sdf.parse(time);//编译时期异常
        System.out.println(date);
    }

    public static void Method() {
        Method();//StackOverflowError
    }
}
