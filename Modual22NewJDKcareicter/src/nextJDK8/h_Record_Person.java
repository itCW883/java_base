package nextJDK8;

public record h_Record_Person(String string) {
    //不能声明实例变量
    //int i;
    static  int i;//可以声明静态变量

  //public h_Record_Person(){};//不能声明空参构造;只能声明全参构造
    public static void method(){};//可以声明静态方法/非静态方法

    public void method02(){}
}
