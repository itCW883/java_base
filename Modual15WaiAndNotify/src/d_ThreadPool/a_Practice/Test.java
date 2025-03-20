package d_ThreadPool.a_Practice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> sb1 = es.submit(new Mcallable());
        Future<String> sb2 = es.submit(new Mcallable2());
        System.out.println(sb1.get());
        System.out.println(sb2.get());
        es.shutdown();
    }
}
