package a_Treading;

public class Test01 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread MT = new MyThread();
        //调用Start方法,开启线程
        MT.start();

        //MT.run();//直接调用重写的run()方法,不代表开启线程
                //如果直接调用这个方法会现在执行run()方法的方法体,在运行主线程


        for (int i = 0; i < 10; i++) {
            System.out.println("这是主线程运行的" + i + "次");
        }
        //每次执行结果不一样,因为java是用的抢占式调度线程
    }
}
