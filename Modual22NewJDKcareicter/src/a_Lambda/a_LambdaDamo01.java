package a_Lambda;

public class a_LambdaDamo01 {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我开始执行啦");
            }
        }).start();
        System.out.println("====================");
        //ambda表达式;可读性会变差


        new Thread(()->
                System.out.println("我开始执行啦")
        ).start();
    }
}
