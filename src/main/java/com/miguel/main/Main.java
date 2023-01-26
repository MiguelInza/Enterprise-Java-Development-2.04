package com.miguel.main;

import com.miguel.classes.Person;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Person person = new Person(23, "Pedro", -10, "Buyer");
        System.out.println(person.getAge());
        System.out.println("Hello world2!");
    }
}