package c_InternalClassThread;

public class Test01 {
    public static void main(String[] args) {


        Thread td = new Thread(new ICThread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "线程执行的第" + i + "次");
                }
            }
        });
        td.setName("哈哈哈 ");//匿名内部类创建的多线程可以直接在创建匿名对象的时候就继续线程命名
        td.start();

       new Thread(new ICThread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "线程执行的第" + i + "次");
                }
            }
        },"哼哼哼").start();
        //匿名内部类创建的多线程可以直接在创建匿名对象的时候就继续线程命名
    }
}
