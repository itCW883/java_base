package Math.DateRelative.JDK8DateRelativeClass;

import java.time.LocalDate;

public class LocalDateDemo01 {
    public static void main(String[] args) {

        //直接创建locldate对象
        //static LocalDate now()
        //从默认时区的系统时钟获取当前日期。
        LocalDate localDate1 = LocalDate.now();
        System.out.println("localDate1 = " + localDate1);

        //创建localdate设置日期(年\月\日)
        //static LocalDate of(int year, Month month, int dayOfMonth)
        //从一年，一个月和一天获得一个 LocalDate的实例。
        LocalDate localDate2 = LocalDate.of(2024, 5, 20);
        System.out.println("localDate2 = " + localDate2);


        LocalDate local = localDate2.withYear(2026).withMonth(11).withDayOfMonth(29);
        System.out.println("local = " + local);
    }
}
