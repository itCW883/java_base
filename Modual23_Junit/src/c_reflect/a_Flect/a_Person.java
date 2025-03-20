package c_reflect.a_Flect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class a_Person {
    private String name;
    private Integer age;
    public double hingt;
    public double weight;
    public String nicname;

    private a_Person(String name) {
        this.name = name;
    }
private void method(String s){
    System.out.println("哈哈哈哈哈哈哈哈哈哈"+s);
}
    private void method2(String s){
        System.out.println("呜呜呜呜呜呜呜呜呜"+s);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
