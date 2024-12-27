package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;
    private Department department;

    @BeforeEach
    void setUp() {
        UUID departmentID = UUID.randomUUID();
        department = new Department("HR", departmentID);
        person = new Person(1, "John Doe", "Male", "1990-01-01", 50000, department);
    }

    @Test
    void getPersonID() {
        assertEquals(1, person.getPersonID());
    }

    @Test
    void getName() {
        assertEquals("John Doe", person.getName());
    }

    @Test
    void getSex() {
        assertEquals("Male", person.getSex());
    }

    @Test
    void getBirthday() {
        assertEquals("1990-01-01", person.getBirthday());
    }

    @Test
    void getDepartment() {
        assertEquals(department, person.getDepartment());
    }

    @Test
    void getSalary() {
        assertEquals(50000, person.getSalary());
    }

    @Test
    void testToString() {
        String expected = "Person{personID=1, name='John Doe', sex='Male', birthday='1990-01-01', department=" + department + ", salary=50000}";
        assertEquals(expected, person.toString());
    }
}