package d_ThreadPool.a_Practice;

import java.util.concurrent.Callable;

public class Mcallable2 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName()+"刚刚执行啦";
    }
}
