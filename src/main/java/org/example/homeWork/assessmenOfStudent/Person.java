package org.example.homeWork.assessmenOfStudent;

public abstract class Person {
   private String name;
   private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}