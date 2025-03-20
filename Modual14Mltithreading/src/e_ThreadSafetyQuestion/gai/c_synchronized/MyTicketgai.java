package e_ThreadSafetyQuestion.gai.c_synchronized;

public class MyTicketgai implements Runnable{
    int ticket=100;

    public synchronized void SamePceMethod()//非静态同步方法默认锁是this
    {
        if(ticket>0){
            //可能出现线程安全问题的代码
                System.out.println(Thread.currentThread().getName() + "抢到第"+ticket+"张票啦");
                ticket--;
        }
    }

    public void run() {
        while (true)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
          //SamePceMethod();//调用同步方法
             SamePceMethod02();
        }

    }

    private void SamePceMethod02() {
        synchronized (this){
            System.out.println(this+"...............");//this就是调用线程的对象
            if (ticket>0){
                //可能出现线程安全问题的代码
                System.out.println(Thread.currentThread().getName() + "抢到第"+ticket+"张票啦");
                ticket--;
            }
        }
    }
}
