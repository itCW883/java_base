package e_Annotation.AnnoPractice2;

public class Calculator {
    @Check
    public void ad(){
        String str=null;
        System.out.println(str.toString());
        System.out.println("1+0="+(1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }
    @Check
    public void mul(){
        System.out.println("1*0="+(1*0));
    }
    @Check
    public void div(){
        int a=1/0;
        System.out.println("1/0="+a);
    }
    public void show(){
        System.out.println("永无bug");
    }
}
