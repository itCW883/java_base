package practice;

public class Android extends Developer{


    public Android(String emNum, String name) {
        super(emNum, name);
    }

    @Override
    public void work() {
        //那个对象调用的this,this就代表那个对象,这里的this代表的是Test01类中的android对象
        System.out.println("Android工程师:员工号为" + this.emNum + "的" + this.name + "员工,正在研发电商的手机APP");
    }

    @Override
    public void work01() {

    }
}
