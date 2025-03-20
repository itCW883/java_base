package a_WaitAndNotify.a_ProductAndConsum;

public class Workplace {
    private Integer baoZi = 0;//包装类的默认值是null所以在此处我进行了手动初始化
    private Boolean tag = false;//包装类的默认值是null所以在此处我进行了手动初始化

    public void getBaoZi() {
       System.out.println("你购买了第"+baoZi+"个包子");
    }

    public void setBaoZi() {
        baoZi++;
        System.out.println("你生产了第"+baoZi+"个包子");
    }

    public Workplace() {
        this.baoZi = baoZi;
    }

    public Workplace(Boolean tag) {
        this.baoZi = baoZi;
    }

    public Boolean getTag() {
        return tag;
    }

    public void setTag(Boolean tag) {
        this.tag = tag;
    }
}
