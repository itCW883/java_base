package recursion;

public class RecrusionDemo02 {
    public static void main(String[] args) {
        System.out.println(JieChen(1));
    }
    public static int JieChen(int n){
       if(n==1){
           return n;
       }
       else
          return n*JieChen(n-1);

    }
}
