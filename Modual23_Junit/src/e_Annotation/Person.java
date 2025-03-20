package e_Annotation;
@SuppressWarnings("all")
public class Person {
    @Book2("哈哈哈哈")
    @Deprecated//该注解代表此方法已过时,不推荐使用
    public void eat(){
        System.out.println("马哥和瘦皮猴的哪些不为人知的事");
    }
}
