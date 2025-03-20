package c_ThreadMethod;

public class MyThread extends Thread{
    @Override
    public void run() {
        //设置线程任务

        for (int i = 0; i < 5; i++) {
            try {
                //线程睡眠
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //throws依然报错原因是因为继承的Thread中的run()方法每throws异常
            System.out.println(Thread.currentThread().getName()+"是一个线程任务执行的第"+i+"次");
                                                                      //Thread-0是一个线程任务执行的第4次
                                                                      //newThread是一个线程任务执行的第2次
                                                                      //只有Thread类和其子类才能调用getName()方法
        }
    }
}
