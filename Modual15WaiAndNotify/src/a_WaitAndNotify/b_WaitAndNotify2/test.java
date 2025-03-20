package a_WaitAndNotify.b_WaitAndNotify2;

public class test {
    public static void main(String[] args) {
        Workplace workplace = new Workplace();

        Product product = new Product(workplace);
        Consume consume = new Consume(workplace);
        Thread thread = new Thread(product);
        Thread thread1 = new Thread(consume);
        thread1.start();
        thread.start();
    }
}
