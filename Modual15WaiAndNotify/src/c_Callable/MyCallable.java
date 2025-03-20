package c_Callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable <String>{

    @Override
    public String call() throws Exception {
        //需要实现的线程任务的代码
        return "哈哈哈............嘿嘿嘿";
    }
}
