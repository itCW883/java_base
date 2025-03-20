package d_ThreadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName()+"是一个Callable线程任务执行了";
    }
}
