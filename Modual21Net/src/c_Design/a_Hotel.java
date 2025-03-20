package c_Design;

public abstract class a_Hotel {
    public void eat(){
        System.out.println("点菜");
        eatcai();
        System.out.println("买单");
    }

   public abstract void eatcai();
}
