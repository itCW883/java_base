package c_Design.b_singleExample.lanha;

import c_Design.b_singleExample.ehan.a_Singleton;

public class b_SingleTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            b_Singleton02 singleton02 = b_Singleton02.getSingleton02();
            System.out.println(singleton02);
        }
    }
}
