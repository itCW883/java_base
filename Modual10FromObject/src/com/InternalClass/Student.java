package com.InternalClass;

public class Student {
    String name="雷文杰";
    class Class{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        void Dianm(){
            String name="周帮金";
            System.out.println(name+"我是内部类局部变量");
            System.out.println(this.name+"我是内部类成员变量");
            System.out.println(Student.this.name+"我是外部类成员变量");
        }

    }
}
