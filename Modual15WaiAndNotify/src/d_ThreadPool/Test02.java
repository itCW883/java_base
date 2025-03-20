package d_ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Future<String> sb1 = exec.submit(new MyCallable());//call方法有返回值需要用Future进行接收
        System.out.println(sb1.get());
        exec.shutdown();

    }
}
