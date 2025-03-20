package Math.DateRelative.JDK8DateRelativeClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemporalAccessor {
    public static void main(String[] args) {
        format();
        Parse();

    }

    private static void Parse() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        String date1="2015-06-11 11:30:30";
        java.time.temporal.TemporalAccessor parse = dateTimeFormatter.parse(date1);
        System.out.println(parse);//结果为:{},ISO resolved to 2015-06-11T11:30:30
        //若想将对象parse转换为常见的LocalDateTime日期对象;就需要用到LocalDteTime中的静态方法
                                                    //static LocalDateTime from(TemporalAccessor temporal)
                                                    //从时间对象获取一个 LocalDateTime的实例。
        LocalDateTime from = LocalDateTime.from(parse);
        System.out.println(from);
    }

    private static void format() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.now();
        String format = dateTimeFormatter.format(localDateTime1);
        System.out.println(format);
    }
}
