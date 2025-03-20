package e_ThreadSafetyQuestion.gai.d_stacticSynchronizedMth;

public class MyTicketgai implements Runnable{
     static int ticket=100;

    public static synchronized void SamePceMethod()//非静态同步方法默认锁是this
    {
        if(ticket>0){
            //静态不能直接访问非静态 if(ticket>0)会报错只需要改变定义的成员变量为静态即可
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

    private static void SamePceMethod02() {
        synchronized (MyTicketgai.class)//MyTicketgai.class传入的参数是一个class对象
        {
            System.out.println(MyTicketgai.class+"...............");//this就是调用线程的对象
            if (ticket>0){
                //可能出现线程安全问题的代码
                System.out.println(Thread.currentThread().getName() + "抢到第"+ticket+"张票啦");
                ticket--;
            }
        }
    }
}
