package d_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        //1:创建线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //2:submit提交多个现场任务
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());
        executorService.submit(new MyRunnable());

        //3:关闭线程池对象
       executorService.shutdown();//不关闭线程池程序会一直等待线程任务的到来

    }
}
