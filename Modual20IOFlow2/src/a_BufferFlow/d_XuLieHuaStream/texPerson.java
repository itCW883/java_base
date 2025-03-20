package a_BufferFlow.d_XuLieHuaStream;

import java.io.Serializable;
import java.util.Objects;

public class texPerson implements Serializable
    //必须要实现Serializable接口才能被序列化
{
    public static final long serialVersionUID = 40L;
    private String name;
    private transient Integer age;
    //transient使用此关键字可以不被序列化

    @Override
    public String toString() {
        return "texPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        texPerson texPerson = (texPerson) o;
        return Objects.equals(name, texPerson.name) && Objects.equals(age, texPerson.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    public texPerson() {
    }

    public texPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
