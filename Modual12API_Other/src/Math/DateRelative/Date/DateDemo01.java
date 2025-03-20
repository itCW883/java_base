package Math.DateRelative.Date;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        Date date1 = new Date();//空参构造可以获取当前系统时间
        System.out.println("date1 = " + date1);

        //Date(Long time)-->获取指定时间传递毫秒值
        Date date = new Date(1000L);
        System.out.println("date = " + date);//使用这个有参构造;时间是由时间原点结合电脑得时区和传入的参数计算的
    }
}
