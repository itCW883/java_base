package com.ruirui.suzhu;
/*数组属于引用数据类型
*   作用为一次存储多个数据
*    特点 :1数组中的数据类型可以为基本数据类型,也可以存引用数据类型
*          2定长(长度多长就只能存多少个数据)定义的时候就要定义长度(最大特点)可少存不可以多存*/
public class suzhudemo01 {
    public static void main(String[] args) {
        /*动态初始化
        *      定义数组时没给数据,只定义数组长度
        * 数据类型[] 数组名=new 数据类型[长度]
        * 数据类型(规定了数组中只能存什么类型数据) 数组名[](几个[]代表几维数组)=new 数据类型(数据类型和左边的数据类型一致)[长度]*/
        int shuZu[]=new int[10];

        /*静态初始化
         *      定义数组时直接存入给数据
         * 数据类型[] 数组名=new 数据类型[长度]{元素1,...,元素n};
         * 数据类型 数组名[]=new 数据类型[长度]{元素1,...,元素n};
         * */
        int arry[]={1,2,2};
        String arry1[]=new String[]{"ghjnv","werf","ghbvgh","ewf"};
    }
}
