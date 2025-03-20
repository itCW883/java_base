package Math.DateRelative.Date;

import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) {


        Dateo2();
    }

    private static void Dateo2() {
        Date d1 = new Date();
        //1:void setTime (Long time)-->设置时间传递毫秒值,从时间原点开始
        d1.setTime(1000L);
        //2:Long getTime()-->获取时间,返回毫秒值
        System.out.println("d1.getTime() = " + d1.getTime());
    }
}
