package e_Annotation.AnnoPractice;

import java.lang.reflect.Method;

@Pro(calssName = "d_FlectPractice.person" , methouNmae = "eat")
public class AnnoCountFor {
    public static void main(String[] args) throws Exception {


        //1:解析注解
        //1.1:获取注解定义位置的对象;(获取本类的字节码文件对象)
        Class<AnnoCountFor> reflect = AnnoCountFor.class;
        //2:获取注解指定方法的对象
        //在内存中生成该注解接口的子类实现对象
        Pro anClass = reflect.getAnnotation(Pro.class);
        //3:调用注解对象中定义的抽象方法,获取返回值(注解对应的属性值)
        //返回值就是@Pro(calssName = "d_FlectPractice.person" , methouNmae = "eat")这里传入的
        String calssedName = anClass.calssName();//d_FlectPractice.person
        String methouedNmae = anClass.methouNmae();//eat
        //4:加载类进内存
        Class<?> aClass = Class.forName(calssedName);//加载properties类进内存
        Object per = aClass.newInstance();
        //    5:根据解析出的MethodName,获取对应的方法
        //根据方法名获取方法
        Method method = aClass.getMethod(methouedNmae);
        //6:运行方法
        method.invoke(per);
    }
}
