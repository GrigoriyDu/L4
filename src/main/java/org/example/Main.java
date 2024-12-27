package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path sourcePath = Path.of("src", "foreign_names.csv");
        try {
            List<Person> persons = CSVProcessor.readPersonsFromCSV(sourcePath);
            persons.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}