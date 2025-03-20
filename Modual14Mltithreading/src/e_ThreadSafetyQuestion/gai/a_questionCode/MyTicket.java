package e_ThreadSafetyQuestion.gai.a_questionCode;

public class MyTicket implements Runnable{
    int ticket=100;

    @Override
    public void run() {
        while (true)
        {
            if(ticket>0){
                System.out.println(Thread.currentThread().getName() + "抢到第"+ticket+"张票啦");
                ticket-=1;
            }

        }

    }
}
