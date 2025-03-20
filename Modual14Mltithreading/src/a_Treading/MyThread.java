package a_Treading;

public class MyThread extends Thread{
    @Override
    public void run() {
        //设置线程任务
        for (int i = 0; i < 5; i++) {
            System.out.println("这是一个线程任务执行的第"+i+"次");
        }
    }
}
