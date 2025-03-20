package e_Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo01Time {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行啦");
            }
        },new Date(),2000);
    }

}
