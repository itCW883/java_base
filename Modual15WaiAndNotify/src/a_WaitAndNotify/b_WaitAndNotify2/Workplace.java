package a_WaitAndNotify.b_WaitAndNotify2;

public class Workplace {
    private Integer baoZi = 0;//包装类的默认值是null所以在此处我进行了手动初始化
    private Boolean tag = false;//包装类的默认值是null所以在此处我进行了手动初始化

    public synchronized void getBaoZi() {
        if(this.tag==false){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {

            System.out.println("你购买了第"+baoZi+"个包子");
            this.tag=false;
            this.notify();

        }

    }

    public synchronized void setBaoZi() {
        if(this.tag==true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            baoZi++;
            System.out.println("你生产了第"+baoZi+"个包子");
            this.tag=true;
            this.notify();

        }

    }

    public Boolean getTag() {
        return tag;
    }

    public void setTag(Boolean tag) {
        this.tag = tag;
    }
}
