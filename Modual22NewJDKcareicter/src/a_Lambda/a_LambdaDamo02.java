package a_Lambda;
/*
* 实际开发过程中在类上做注释用文档注释
* 因为
* */
public class a_LambdaDamo02 {
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public void Open() {
                System.out.println("USB打开了");
            }
        });
        System.out.println("=========================");
        /**
         * 函数时接口
         * */
       method(() -> System.out.println("hhhhh"));
    }

   /**
    * 文档注释
    * */
    public static void method(USB usb){
        usb.Open();
    }
}
