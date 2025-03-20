package h_set;

import java.util.Objects;

public class b_hash_employee {
    private String name;
    private int age;

    public b_hash_employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public b_hash_employee() {
    }

    @Override
    public String toString() {
        return "b_hash_employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void work(){
        System.out.println("工作");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        b_hash_employee that = (b_hash_employee) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
