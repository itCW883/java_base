package c_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class a_Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();

        // FutureTask的构造方法专用于传Callable的接口(实现类)
        FutureTask<String> stringFutureTask = new FutureTask<>(myCallable);

        //创建Thread对象,传入Runnable接口:
        // FutureTask实现了RunnableFuture接口;RunnableFuture继承了Runnable
        //因此FutureTask输入Runnable的实现类
        Thread thread = new Thread(stringFutureTask);

        //开启线程
        thread.start();

        //使用get方法获取call方法返回值
        System.out.println(stringFutureTask.get());

    }
}
