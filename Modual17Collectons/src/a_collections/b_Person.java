package a_collections;

public class b_Person {
    private String name;
    private Integer age;


    public b_Person() {

    }

    public b_Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person("+
                "name='"+name+'\''+
                ",age:"+age+')';
    }
}

