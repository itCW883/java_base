package recursion;

public class RecrusionDemo01 {
    public static void main(String[] args) {
       Method(3);
    }
    //使用递归一定要有结束条件,否则会内存溢出
    public static void Method(int j){
      if(j==1){
          System.out.println(j);
          return ;
      }
        System.out.println(j);
      j--;
      Method(j);

    }

}
