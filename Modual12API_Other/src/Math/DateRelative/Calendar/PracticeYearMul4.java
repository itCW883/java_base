package Math.DateRelative.Calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PracticeYearMul4 {
    public static void main(String[] args) {
        //输入年份判断该年是闰年还是平年
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        calendar.set(scanner.nextInt(),2,1);
        //calendar.set(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        calendar.add(Calendar.DATE,-1);
       // Date date = calendar.getTime();
       // System.out.println(date);
        if(calendar.get(Calendar.DATE)==29){
            System.out.println("是闰年");
        }
        else
            System.out.println("是平年");

    }
}
