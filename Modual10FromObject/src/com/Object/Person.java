package com.Object;

import java.util.Objects;

public class Person implements Cloneable{
    private String name;
    private int age;
    private boolean sex;

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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Person(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    @Override
public String toString(){
        if (this.isSex())
            return name+age+"男";
        else
            return name+age+"女";

    }

   /* public boolean equals(Person person){
       if(this.name!=person.name
       ||this.age!=person.age
       ||this.sex!=person.sex)
           return false;
       return true;
    }*/
/*   public boolean equals(Object object){
       if(this==object){//解决传输数据为自身问题[提高效率]
           return true;
       }
       if(object==null){//解决数据null问题
           return false;
       }
       if (object instanceof Person){//解决传输类型不匹配问题
           Person p=(Person) object;//解决类型转换多态问题
           return this.name.equals(p.name)&&this.age==p.age&&this.sex== p.sex;
       }
       return false;
   }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//getClass() != o.getClass()判断是否为同类型
        Person person = (Person) o;
        return age == person.age && sex == person.sex && Objects.equals(name, person.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
