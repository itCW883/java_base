package Math.DateRelative.JDK8DateRelativeClass;

import java.time.LocalDate;

public class Plusandmius {
    public static void main(String[] args) {
        //plus向后偏移
        LocalDate localDate = LocalDate.now();

        LocalDate localDate1 = localDate.plusYears(1);
        System.out.println("localDate1 = " + localDate1);

        //mius向前偏移
        LocalDate minus = localDate.minusYears(1);
        System.out.println("minus = " + minus);

    }
}
