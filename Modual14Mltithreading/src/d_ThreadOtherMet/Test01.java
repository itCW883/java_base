package d_ThreadOtherMet;

public class Test01 {
    public static void main(String[] args) {
        ThreadOtherMethod tom1 = new ThreadOtherMethod();

        tom1.setPriority(10);//设置线程优先级
        tom1.start();
        tom1.setName("哈哈哈哈");
        int p1 = tom1.getPriority();//获取线程优先级
        System.out.println(p1);

        ThreadOtherMethod tom2 = new ThreadOtherMethod();
        tom2.start();
        tom2.setName("嘿嘿嘿嘿");
        int p2 = tom2.getPriority();//获取线程优先级
        System.out.println(p2);//结果为5的原因是5是默认优先级
                                    //最小优先级:1
                                    //默认优先级:5
                                    //最大优先级:10
    }
}
