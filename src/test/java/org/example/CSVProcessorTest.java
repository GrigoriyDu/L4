package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVProcessorTest {

    private Path csvFilePath;

    @BeforeEach
    void setUp() {
        csvFilePath = Path.of("src", "test", "resources", "test_foreign_names.csv");
    }

    @Test
    void readPersonsFromCSV() {
        try {
            List<Person> persons = CSVProcessor.readPersonsFromCSV(csvFilePath);
            assertFalse(persons.isEmpty());
            assertEquals(3, persons.size()); // Предполагается, что в тестовом файле 3 записи
        } catch (IOException e) {
            fail("Exception should not be thrown");
        }
    }
}