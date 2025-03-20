package a_WaitAndNotify.a_ProductAndConsum;

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
            synchronized (productor){
                if(!productor.getTag()){
                    try {
                        productor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    productor.getBaoZi();
                    productor.setTag(false);
                    productor.notify();

                }
            }
        }
    }

}
