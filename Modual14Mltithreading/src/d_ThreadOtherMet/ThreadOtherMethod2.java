package d_ThreadOtherMet;

public class ThreadOtherMethod2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了"+i);
            Thread.yield();
            //礼让线程只是尽可能的平衡,不是绝对的你来我往,有可能线程a先执在行礼让线程b后又抢到cpu的执行权
        }
    }

}
