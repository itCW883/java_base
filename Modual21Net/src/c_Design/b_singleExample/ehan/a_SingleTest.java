package c_Design.b_singleExample.ehan;

public class a_SingleTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            a_Singleton singleton = a_Singleton.getSingleton();
            System.out.println(singleton);
        }
    }
}
