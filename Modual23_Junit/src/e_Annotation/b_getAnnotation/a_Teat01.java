package e_Annotation.b_getAnnotation;

import org.junit.Test;

import java.util.Arrays;

public class a_Teat01 {
    public static void main(String[] args) {
        //1:获取要判断注解位置所在类的class对象
        Class<a_bookShelf> abook = a_bookShelf.class;
        //2:判断指定类上有没有指定注解
        boolean annotationPresent = abook.isAnnotationPresent(Book.class);
        //3:判断 ,判断函数的返回值是否为真
        if(annotationPresent){
       //4:获取属性值
            Book annotation = abook.getAnnotation(Book.class);
            System.out.println(annotation.bookname());
            System.out.println(annotation.quality());
            System.out.println(annotation.price());
            System.out.println(Arrays.toString(annotation.authors()));
        }
        System.out.println(annotationPresent);//false
/**原因:注解未加载到内存中;因此导致判断失败*/
    }
}
