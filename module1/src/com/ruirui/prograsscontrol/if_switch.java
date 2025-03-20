package com.ruirui.prograsscontrol;
/*switch和if的区别
*   1:switch直接跳到相匹配的地方,if是从上到下逐个判断*/
public class if_switch {
    public static void main(String[] args) {
        int a=7;
        if (a==1){
            System.out.println("今天是星球一");
        }
        else if (a==2){
            System.out.println("今天是星球二");
        }
        else if (a==2){
            System.out.println("今天是星球二");
        }
        else if (a==3){
            System.out.println("今天是星球三");
        }
        else if (a==4){
            System.out.println("今天是星球四");
        }
        else if (a==5){
            System.out.println("今天是星球五");
        }
        else if (a==6){
            System.out.println("今天是星球六");
        }
        else if (a==7){
            System.out.println("今天是星球天");
        }
//        switch (a){
//            case 1:{System.out.println("今天是星球一");}break;
//            case 2:{System.out.println("今天是星球二");}break;
//            case 3:{System.out.println("今天是星球三");}break;
//            case 4:{System.out.println("今天是星球四");}break;
//            case 5:{System.out.println("今天是星球五");}break;
//            case 6:{System.out.println("今天是星球六");}break;
//            case 7:{System.out.println("今天是星球日");}break;
//            default:
//                System.out.println("一周只有七天哦");
//        }
    }
}
