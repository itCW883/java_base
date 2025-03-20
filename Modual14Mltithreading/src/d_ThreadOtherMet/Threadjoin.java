package d_ThreadOtherMet;

public class Threadjoin {
    public static void main(String[] args) throws InterruptedException {
        ThreadOtherMethod td1 = new ThreadOtherMethod();
        td1.join();
        /*
        * 表示把td1线程插入到当前线程(主线程)之前
        * */
        td1.start();
        for (int i = 10; i > 0; i--) {
            System.out.println(Thread.currentThread().getName()+"这是主线程运行的" + i + "次");
        }
    }
}
