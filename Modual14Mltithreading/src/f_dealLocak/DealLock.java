package f_dealLocak;

public class DealLock implements Runnable{
private boolean flag;

    public DealLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag){
            synchronized (LockA.locka){
                System.out.println("if ................. locka");
                synchronized (LockB.Lockb){
                    System.out.println("if ................. lockb");
                }
            }
        }
      else {
            synchronized (LockB.Lockb){
                System.out.println("else ................. lockb");
                synchronized (LockA.locka){
                    System.out.println("else ................. locka");
                }
            }
        }

    }
}
