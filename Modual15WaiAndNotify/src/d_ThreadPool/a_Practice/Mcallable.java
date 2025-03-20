package d_ThreadPool.a_Practice;

import java.util.concurrent.Callable;

public class Mcallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Integer sum=0;
        for (int i = 1; i < 101; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
