package Math.DateRelative.JDK8DateRelativeClass;

import java.time.LocalDateTime;

public class Duration {
    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.of(2025, 6, 11, 12, 30, 59);
        LocalDateTime localDateTime2 = LocalDateTime.of(2024, 6, 11, 12, 30, 59);
        java.time.Duration between = java.time.Duration.between(localDateTime1, localDateTime2);//后减前
        System.out.println(between.toDays());
        System.out.println(between.toHours());
        System.out.println(between.toMinutes());
        System.out.println(between.toMillis());
    }
}
