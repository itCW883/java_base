package d_ThreadOtherMet;

public class setDaemonThread {
    public static void main(String[] args) {
        ThreadOtherMethod td1 = new ThreadOtherMethod();
        ThreadOtherMethod2 td2 = new ThreadOtherMethod2();
        td2.setDaemon(true);
        //非守护线程循环完后守护线程就会结束
        //但是守护线程可能并不会马上结束;因为可能存在延时问题
        td1.setName("零零零零");
        td2.setName("一一一一");
        td1.start();
        td2.start();

    }
}
