package c_InternalClassThread;

public class ICThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "线程执行的第" + i + "次");
        }
    }
}
