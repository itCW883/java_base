package e_ThreadSafetyQuestion.gai.c_synchronized;

public class Ticket {
    public static void main(String[] args) {
        MyTicketgai t1 = new MyTicketgai();
        //new几次就会有几个线程对象
        System.out.println(t1);

        Thread td1 = new Thread(t1, "张三");//还是使用的同一个类里面的数据
        Thread td2 = new Thread(t1, "李四");//还是使用的同一个类里面的数据
        Thread td3 = new Thread(t1, "赵六");//还是使用的同一个类里面的数据

        td1.start();
        td2.start();
        td3.start();
//赵六抢到第100张票啦
//李四抢到第100张票啦
//张三抢到第100张票啦
        //出现线程问题都访问了同一个数据,原因是cpu在多个线程之间做高速切换

    }
}
