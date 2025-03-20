package e_Annotation;
//定义注解
public @interface Book {
    String bookname();
    String[] authors();
    double price();
    int quality() default 100;
}
