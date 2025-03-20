package Math.DateRelative.JDK8DateRelativeClass;

import java.time.LocalDate;

public class LocalDateTime {
    public static void main(String[] args) {
        //获取对象方式:
        //直接创建LocalDateTime对象
        //static LocalDateTime now()
        //从默认时区的系统时钟获取当前日期。
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now();
        System.out.println("localDateTime1 = " + localDateTime1);

        //创建LocalDateTime设置日期(年\月\日\时\分\秒)
        // LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
        //从一年，一个月和一天,一时,一分,一秒获得一个 LocalDateTime的实例。
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.of(2024, 4, 1, 3, 2, 1);
        System.out.println("localDateTime2 = " + localDateTime2);
    }
}
