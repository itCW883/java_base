package c_ThreadMethod;

public class Test01 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread MT = new MyThread();
        //调用Start方法,开启线程
        MT.start();

        MyThread TD = new MyThread();
        //给线程设置名称
        TD.setName("newThread");//newThread是一个线程任务执行的第3次
        TD.start();
        //MT.run();//直接调用重写的run()方法,不代表开启线程
                //如果直接调用这个方法会现在执行run()方法的方法体,在运行主线程


        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"这是主线程运行的" + i + "次");
            //Thread.currentThread()在哪个线程中使用就是返回哪个线程的对象
            //只有Thread类和其子类才能调用getName()方法
        }
        //每次执行结果不一样,因为java是用的抢占式调度线程
    }
}
