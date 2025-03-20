package nextJDK8;
/**jdk8以前接口是不能定义私有方法的
 * 私有方法外界不能调用;只能在内部调用*/
/**
 * 私有方法使用场景:
 *      因为有默认方法和静态方法这样具有具体实现的方法;那么可能会出现多个方法有共同的代码可以抽取,
 *      这些共同的代码抽取出来又只希望接口内部使用;所以就增加了私有方法
 * */
public interface USB {
    private void open(){
        System.out.println("USB接口私有非静态方法");
    };
    private static void close(){
        System.out.println("USB接口私有静态方法");
    }
    //定义一个默认方法来对私有方法进行调用
    public default void methoddef(){
        open();
        close();
    }
}
