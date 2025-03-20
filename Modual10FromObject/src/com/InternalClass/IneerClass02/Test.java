package com.InternalClass.IneerClass02;

public class Test {
    public static void main(String[] args) {
        Methoud(new Mouse());
// 返回值是什么类型就用什么类型(接口也算类型)接收对象
// [此处接收方法返回的对象;还是多态形式]

       USB m1=Methoud02();//相当于USB m1 = new Mouse();
                        // 因为返回值是:return new Mouse();
        m1.OPEN();
    }
    //接口作为方法参数,传递实参时传递的时实现类对象
    public static void Methoud(USB usb){//USB usb=new Mouse
        if(usb instanceof Mouse){
            usb.OPEN();
        }
    }
    //接口作为返回值类型实际返回的是实现类对象
    public static USB Methoud02(){

        /*
        *  Mouse mouse = new Mouse();
        return mouse;
        * */
        //匿名对象返回
        return new Mouse();
    }
}
