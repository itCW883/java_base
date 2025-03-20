package practice;

public abstract class Company {
    String emNum;
    String name;

    public abstract void work();

    public Company() {
    }

    public abstract void work01();
    public Company(String emNum, String name) {
        this.emNum = emNum;
        this.name = name;
    }

    public String getEmNum() {
        return emNum;
    }

    public void setEmNum(String emNum) {
        this.emNum = emNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*子类创造对象类初始化父类属性*/
}
