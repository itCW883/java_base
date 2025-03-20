package com.ruirui.prograsscontrol;

public class xuhunaxountral {
    public static void main(String[] args) {
        /*
        * break:1:在switch中代表结束switch语句
        *       2:在循环中代表结束循环
        * continue:结束本次循环,直接进入下一次循环
        * */
        for (int i = 1; i <= 5; i++) {
            if(i==3){
//                break;/*我爱Java1我爱Java2*/
                continue;/*我爱Java1 我爱Java2 我爱Java4 我爱Java5*/
        }
            System.out.println("我爱Java"+  i);
        }

        }
}
