package com.InternalClass;

public class Person {
    public void eat(){
        System.out.println("人要吃饭");
    }
    static final class Heart{
       private int MaiB;

        public int getMaiB() {
            return MaiB;
        }

        public void setMaiB(int maiB) {
            MaiB = maiB;
        }

        public static void XingT(){
            System.out.println("我的心脏怦怦跳");
        }
    }
    class Hand{
        public void XiShou(){
            System.out.println("饭前便后要洗手");
        }
    }

}
