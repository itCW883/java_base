package Math.PacageClass;

public class ProtalJavaBean {
    private Integer uid;//标准JavaBean不使用基本数据类型
    private String uname;
    private String pws;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPws() {
        return pws;
    }

    public void setPws(String pws) {
        this.pws = pws;
    }

    public ProtalJavaBean(String uname, Integer uid, String pws) {
        this.uname = uname;
        this.uid = uid;
        this.pws = pws;
    }

    public ProtalJavaBean() {
    }
}
