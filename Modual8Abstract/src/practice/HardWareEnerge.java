package practice;

public class HardWareEnerge extends Maintainer{
    @Override
    public void work() {
        System.out.println("硬件工程师工程师:员工号为" + this.emNum + "的" + this.name + "员工,正在修复电脑主板");
    }

    @Override
    public void work01() {

    }

    public HardWareEnerge(String emNum, String name) {
        super(emNum, name);
    }
}
