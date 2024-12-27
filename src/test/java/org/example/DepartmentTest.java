package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    private Department department;
    private UUID departmentID;

    @BeforeEach
    void setUp() {
        departmentID = UUID.randomUUID();
        department = new Department("HR", departmentID);
    }

    @Test
    void getDepartmentName() {
        assertEquals("HR", department.getDepartmentName());
    }

    @Test
    void getDepartmentID() {
        assertEquals(departmentID, department.getDepartmentID());
    }

    @Test
    void testToString() {
        String expected = "Department{departmentName='HR', departmentID=" + departmentID + "}";
        assertEquals(expected, department.toString());
    }
}
