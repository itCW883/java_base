package Math.DateRelative.Calendar;

import java.util.Calendar;

public class CalendarDemo01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//Calendar.getInstance()是Calendar的一个子类对象
                                                    //具体子类对象默认情况下会因时区而有所不同
                                                    //东八区为:GregorianCalendar
        System.out.println(calendar);
        System.out.println("Calendar.getInstance() = " + Calendar.getInstance());
    }
}
