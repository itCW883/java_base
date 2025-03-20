package a_WaitAndNotify.b_WaitAndNotify2;

public class Consume implements Runnable{
    private Workplace productor ;

    public Consume(Workplace productor) {
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
                productor.getBaoZi();//调用同步方法
        }
    }

}
