package com.miguel;

import com.miguel.classes.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    public void testValidAge() {
        Person person = new Person(1, "John", 30, "Developer");
        assertEquals(30, person.getAge());
    }
}