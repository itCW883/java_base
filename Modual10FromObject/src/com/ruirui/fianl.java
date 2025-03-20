package com.ruirui;

public class fianl {
    public static void main(String[] args) {
        final Object CY = new Object(18,"hhh");
        CY.setAge(90);
        System.out.println(CY.getAge() + CY.getName());
        System.out.println(CY);
    }
    public static class Object {
        int age;
        String name;

        public Object(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Object() {
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
