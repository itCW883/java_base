package practice;

public class JaveEE extends Developer{
    public JaveEE(String emNum, String name) {
        super(emNum, name);
    }

    public JaveEE() {
    }

    @Override
    public void work() {

        System.out.println("JavaEE工程师:员工号为" + this.emNum + "的" + this.name + "员工,正在研发电商的网站");
    }

    @Override
    public void work01() {
        System.out.println("Android工程师:员工号为" + this.getEmNum() + "的" + this.getName() + "员工,正在研发电商的网站");
    }
}
