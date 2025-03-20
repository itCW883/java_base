package b_Generics.b_intendGenericsClass;

import java.util.Arrays;

public class a_demoo1Generics <X>{
    //定义一个书数组;充当ArryList底层的数组,直接规定为10
    Object[] obj=new Object[10];
    //定义size;代表集合元素个数
    int size;
    //定义一个add方法,参数类型需要和泛型类型保持一致
    //数据类型为x变量名随便取
    public boolean add(X x){
        obj[size]=x;
        size++;
        return true;
    }
    //定义一个get方法,根据索引获取元素
    public X get(int index){
        return (X) obj[index];//需要强转为为泛型;方便后面使用的时候转为object的子类类型
    }


    //定义tostring方法
    @Override
    public String toString() {
        return Arrays.toString(obj);//打印数组中的数据
    }
}
