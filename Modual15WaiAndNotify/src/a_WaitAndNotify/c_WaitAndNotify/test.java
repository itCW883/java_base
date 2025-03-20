package a_WaitAndNotify.c_WaitAndNotify;

public class test {
    public static void main(String[] args) {
        Workplace workplace = new Workplace();

        Product product = new Product(workplace);
        Consume consume = new Consume(workplace);

        //多等待多唤醒
        //多条线程生产,多条线程消费

        new Thread(product).start();
        new Thread(product).start();
        new Thread(product).start();


        new Thread(consume).start();
        new Thread(consume).start();
        new Thread(consume).start();

    }
}
