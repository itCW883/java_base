package d_ThreadOtherMet;

public class ThreadOtherMethod extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了"+i);
        }
    }

}
