package Math.DateRelative.JDK8DateRelativeClass;

import java.time.LocalDate;

public class Period {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2027, 8, 15);
        LocalDate localDate2 = LocalDate.of(2022,7,1);
        java.time.Period between = java.time.Period.between(localDate1, localDate2);//后减前
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
    }
}
