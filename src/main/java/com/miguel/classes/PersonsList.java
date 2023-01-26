package com.miguel.classes;

import java.util.ArrayList;
import java.util.List;

//Create a PersonsList class that holds a List of Person objects. Create a findByName method. The method should take in a String name and return the Person with a name that matches exactly. The Person name property and the method name parameter should be formatted as "firstName lastName". Throw an exception if the name parameter is not properly formatted. Include all tests.
public class PersonsList {
    private List<Person> persons;

    public PersonsList() {
        this.persons = new ArrayList<Person>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public Person findByName(String name) {
        if (!name.contains(" ")) {
            throw new IllegalArgumentException("Name must be in format 'firstName lastName'");
        }
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}
