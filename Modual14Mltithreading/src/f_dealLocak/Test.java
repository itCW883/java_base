package f_dealLocak;

public class Test {
    public static void main(String[] args) {
        DealLock dealLock1 = new DealLock(true);
        DealLock dealLock2 = new DealLock(false);
        Thread thread = new Thread(dealLock1);
        Thread thread2 = new Thread(dealLock2);
        thread.start();
        thread2.start();
    }
}
