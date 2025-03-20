package a_WaitAndNotify.b_WaitAndNotify2;

public class Product implements Runnable{

    private Workplace productor ;

    public Product(Workplace productor) {
        this.productor = productor;
    }

    @Override
    public void run() {

        while(true){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           productor.setBaoZi();//调用同步方法
        }
    }
}
