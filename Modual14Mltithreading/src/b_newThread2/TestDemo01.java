package b_newThread2;

public class TestDemo01 {
    public static void main(String[] args) {
        NewThread ntd1 = new NewThread();
        /*
        *   Thread(Runnable target[传入的是runnable的实现类])
        * */
        Thread Td = new Thread(ntd1);

        Td.start();
        Td.setName("哈哈哈哈");

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行了" + i + "次");
        }
    }
}
