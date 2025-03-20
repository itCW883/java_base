package Math.DateRelative.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

//        StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition pos)
//        将给定的 Date成日期/时间字符串，并将结果追加到给定的 StringBuffer 。
        String format = sdf.format(new Date());
        System.out.println("format = " + format);

//       Date parse(String text, ParsePosition pos)
//          从字符串中解析文本以产生一个 Date 。
        String time2="2000-10-10 12:12:12";
        Date parse = sdf.parse(time2);
        System.out.println("parse = " + parse);//若传入对象的格式于指定格式不对应会报ParseException异常


    }
}
