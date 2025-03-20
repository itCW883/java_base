package d_ThreadOtherMet;

public class Threadyield {
    public static void main(String[] args) {
        ThreadOtherMethod2 td1 = new ThreadOtherMethod2();
        ThreadOtherMethod2 td2 = new ThreadOtherMethod2();
        td1.setName("1111");
        td2.setName("2222");

        td1.start();
        td2.start();

    }
}
