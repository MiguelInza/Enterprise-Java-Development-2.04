package com.miguel.classes;
//Create a Person class that has properties id, name, age, and occupation. Throw an error if someone tries to set age to less than 0. Include all tests.
public class Person {
    private int id;
    private String name;
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0");
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
