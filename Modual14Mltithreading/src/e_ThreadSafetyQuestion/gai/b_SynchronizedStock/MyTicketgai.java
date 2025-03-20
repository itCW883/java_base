package e_ThreadSafetyQuestion.gai.b_SynchronizedStock;

public class MyTicketgai implements Runnable{
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
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(ticket>0){
                synchronized (ob)//上锁的锁对于其他对象来说也必须是同一把锁
                 {
                    //可能出现线程安全问题的代码
                    System.out.println(Thread.currentThread().getName() + "抢到第"+ticket+"张票啦");
                    ticket--;
                }
            }

        }

    }
}
