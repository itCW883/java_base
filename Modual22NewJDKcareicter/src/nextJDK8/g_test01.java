package nextJDK8;

import java.util.Scanner;

public class g_test01 {
    public static void main(String[] args) {
        g_dog dog = new g_dog();
        methodA(dog);
        methodA2(dog);
    }
    //JDK16后instanceof的新特性
    private static void methodA2(g_Aimal aimal) {
        if(aimal instanceof g_dog dog){
            dog.eat();
            dog.lookdoor();
        }
    }
//JDK16前的instanceof
    private static void methodA(g_Aimal aimal) {
        if(aimal instanceof g_dog){
            g_dog dog=(g_dog) aimal;
            dog.eat();
            dog.lookdoor();
        }
    }
}
