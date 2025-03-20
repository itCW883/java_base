package com.DuiXiangShuZ;

public class DuiXiangSZTestDemo01 {
    public static void main(String[] args) {
   Persion[] p=new Persion[3];
    Persion persion1=new Persion();
        persion1.setName("哼哼哼");
        persion1.setAge(19);
        Persion persion2=new Persion();
        persion2.setName("哼哼哼");
        persion2.setAge(19);
        Persion persion3=new Persion();
        persion3.setName("哼哼哼");
        persion3.setAge(19);
        p[0]=persion1;
        p[1]=persion2;
        p[2]=persion3;
        for (int i = 0; i < p.length; i++) {
            //需要带哦有getname和getage方法要不然是显示地址值
            System.out.println(p[i].getName()+p[i].getAge());
        }
        //取值
        Persion P=p[0];
        System.out.println(P.getName()+"++++"+P.getAge());
    }
}
