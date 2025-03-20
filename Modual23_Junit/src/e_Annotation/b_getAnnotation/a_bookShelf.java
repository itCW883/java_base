package e_Annotation.b_getAnnotation;

@Book(bookname = "马哥与瘦皮猴",authors = {"马哥","瘦皮猴"},quality = 99,price = 999)
public class a_bookShelf {

    @Book(bookname = "马哥与瘦皮猴",authors = "马哥",quality = 99,price = 999)
    public void method(){}

}
