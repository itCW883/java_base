package random;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        //在指定范围内随机生成整数在Java.util包下
        Random rand=new Random();
        //rand.nextInt()[表示在int的范围内的随机一个整数]
        // rand.nextInt()不等于scanner的nextInt()
//        可以填一个(0--X-1)或两个数(包含前不包含后)
        int i = rand.nextInt(100,1000);
        System.out.println("i = " + i);

    }
}
