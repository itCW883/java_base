package Math.DateRelative.JDK8DateRelativeClass;

import java.time.LocalDate;

public class LocalDateWith {
    public static void main(String[] args) {
        LocalDate local1 = LocalDate.now();

//LocalDate with(TemporalAdjuster adjuster)
//返回此日期的调整副本。
//LocalDate with(TemporalField field, long newValue)
//返回此日期的副本，并将指定的字段设置为新值。
//LocalDate withDayOfMonth(int dayOfMonth)
//返回此日期的副本，并更改日期。
        LocalDate l3 = local1.withDayOfMonth(30);
        System.out.println("l3.getDayOfMonth() = " + l3.getDayOfMonth());

//LocalDate withDayOfYear(int dayOfYear)
//返回此日期的副本，并更改日期。
        LocalDate l2 = local1.withDayOfYear(365);
        System.out.println("l2.getYear() = " + l2.getDayOfYear());

//LocalDate withMonth(int month)
//返回这个日期的副本，并更改年月日。
        LocalDate l1 = local1.withMonth(8);
        System.out.println("l1.getMonthValue() = " + l1.getMonthValue());
        System.out.println("l1 = " + l1);
        System.out.println("local1 = " + local1);

//LocalDate withYear(int year)
//返回此日期的副本，并更改年份。
        LocalDate l4 = local1.withYear(2026);
        System.out.println("l4.getYear() = " + l4.getYear());
    }
}
