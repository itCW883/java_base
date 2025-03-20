package a_WaitAndNotify.c_WaitAndNotify;

public class Workplace {
    private Integer baoZi = 0;//包装类的默认值是null所以在此处我进行了手动初始化
    private Boolean tag = false;//包装类的默认值是null所以在此处我进行了手动初始化

    public synchronized void getBaoZi() {
       while(this.tag==false){
           //不光可通过while解决还可以通过if else进行解决
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println("你购买了第"+baoZi+"个..................包子");
            this.tag=false;
            this.notifyAll();

    }

    public synchronized void setBaoZi() {
        while (this.tag==true){
            //不光可通过while解决还可以通过if else进行解决
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            baoZi++;
            System.out.println("你生产了第"+baoZi+"个----------------------------包子");
            this.tag=true;
            //唤醒所有等待线程
            this.notifyAll();

    }

    public Boolean getTag() {
        return tag;
    }

    public void setTag(Boolean tag) {
        this.tag = tag;
    }
}
