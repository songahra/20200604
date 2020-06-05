package com.inzent.demo;

public class UserDO {
    public int age;
    public String name;

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
     
     public UserDO(int age, String name) {
        super();
        this.age = age;
        this.name = name;
     }
}