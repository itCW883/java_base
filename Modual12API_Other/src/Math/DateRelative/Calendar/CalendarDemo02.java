package Math.DateRelative.Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo02 {
    public static void main(String[] args) {

        Calendar02();


    }

    private static void Calendar02() {
       //获取Calendar
        Calendar calendar01 = Calendar.getInstance();//多态形式

        //int get(int field)
        //返回给定日历字段的值 。
        int mounth = calendar01.get(Calendar.MONTH);
        System.out.println("calendar01.get(Calendar.YEAR) = " + calendar01.get(Calendar.YEAR));
        System.out.println("mounth = " + mounth);

        //void set(int field, int value)
        //将给定的日历字段设置为给定的值。
        calendar01.set(Calendar.YEAR,2055);
        System.out.println("calendar01.get(Calendar.YEAR) = " + calendar01.get(Calendar.YEAR));

        //abstract void add(int field, int amount)
        //根据日历的规则，将指定的时间量添加或减去给定的日历字段。
        calendar01.add(Calendar.YEAR,-1);
        System.out.println(calendar01.get(Calendar.YEAR));
        calendar01.add(Calendar.YEAR,2);
        System.out.println(calendar01.get(Calendar.YEAR));

        //Date getTime()
        //返回一个 Date表示此物体 Calendar的时间值（毫秒从偏移 Epoch “）。
        //将calendar转为date类型
        Date date = calendar01.getTime();
        System.out.println(date);

        //void set(int year, int month, int date)
        //设置日历字段中的值 YEAR ， MONTH和 DAY_OF_MONTH
        //直接设置年月日
        calendar01.set(2024,8,16);
        Date date2 = calendar01.getTime();
        System.out.println(date2);


        //用于设置时间传入date类型数据
        Date date1 = new Date(0L);
        calendar01.setTime(date1);
        System.out.println(calendar01.get(Calendar.YEAR)+"   "+calendar01.get(Calendar.MONTH)+"     "+calendar01.get(Calendar.DATE));
    }
}
