package b_Lock.a_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTicketgai implements Runnable{
    Lock lock = new ReentrantLock();//创建lock的实现类对象
    int ticket=100;
   //任意new一个对象,任何对象都可以,被锁的对象
        // [必须是成员变量,以为如果是方法的局部变量,就会调用一次方法new一个对象]
    Object ob=new Object();
    @Override
    public void run() {
        while (true)
        {
            try {
                Thread.sleep(1000);
                lock.lock();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName() + "抢到第"+ticket+"张票啦");
                    ticket--;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();//锁一定会被释放所有放入finally代码块中
            }

        }

    }
}
