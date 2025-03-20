package Math.DateRelative.JDK8DateRelativeClass;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class LocalD {
    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.now();

        //int getDayOfMonth()
        //获取月中的第几天。
        int dom = localDateTime1.getDayOfMonth();
        System.out.println("dom = " + dom);//dom = 17运行程序当月的第几天

        //DayOfWeek getDayOfWeek()
        //获取星期几字段，这是一个枚举 DayOfWeek 。
        DayOfWeek dayOfWeek = localDateTime1.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);//dayOfWeek = TUESDAY 运行程序当周的第几天

        //int getDayOfYear()
        //获得一年之中的第几天。
        int dayOfYear = localDateTime1.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);//dayOfYear = 261 运行程序当年的第几天

        //Era getEra()
        //获得这个时代适用的时代。

        //long getLong(TemporalField field)
        //从此日期获取指定字段的值为 long 。


        //Month getMonth()
        //使用 Month枚举获取月份字段。
        Month month = localDateTime1.getMonth();
        System.out.println("month = " + month);

        //int getMonthValue()
        //将月份字段从1到12。
        int monthValue = localDateTime1.getMonthValue();
        System.out.println("monthValue = " + monthValue);//monthValue = 9 运行程序当年的第几个月

        //int getYear()
        //获取年份字段。
        int year = localDateTime1.getYear();
        System.out.println("year = " + year);//year = 2024 运行程序的那年
    }
}
