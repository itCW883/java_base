package enumeration;

public enum a_enum01 {
    //无参时相当于 a_enum01  WEIFUKUAN = new a_enum01()
    // a_enum01  WEIFUKUAN = new a_enum01("未付款")
     WEIFUKUAN("未付款"),
    YIFUKUAN("已付款"),
    WEIFAHO("未发货"),
    YIFAHUO("已发货");

    private String name;

    a_enum01() {
    }

    a_enum01(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
