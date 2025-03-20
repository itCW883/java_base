package practice;

public class Netenergee extends  Maintainer{
    public Netenergee(String emNum, String name) {
        super(emNum, name);
    }

    @Override
    public void work() {
        System.out.println("Android工程师:员工号为" + this.emNum + "的" + this.name + "员工,正在检查网络是否通畅");
    }

    @Override
    public void work01() {

    }
}
