package a_Junit;

import java.util.ArrayList;
import java.util.List;

public class a_Category {
    /**
     * 添加功能*/
    public int add(String catrgoryName){
        ArrayList<String> list = new ArrayList<>();
        list.add(catrgoryName);
        return 1;
    }
    /**
     * 查询功能*/
    public List<String> findAllcatrgory(){
        ArrayList<String> list = new ArrayList<>();
        list.add("蔬菜");
        list.add("水果");
        list.add("服装");
        list.add("家电");
        list.add("汽车");
        return list;
    }
}
