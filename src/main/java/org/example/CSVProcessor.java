package org.example;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Класс для обработки CSV файлов и создания списка объектов Person.
 */
public class CSVProcessor {
    private static final char DELIMITER = ';';

    /**
     * Читает данные из CSV файла и создает список объектов Person.
     *
     * @param csvFilePath Путь к CSV файлу.
     * @return Список объектов Person.
     * @throws IOException Если возникает ошибка ввода-вывода.
     */
    public static List<Person> readPersonsFromCSV(Path csvFilePath) throws IOException {
        List<Person> persons = new ArrayList<>();
        HashMap<String, UUID> departmentUUIDs = new HashMap<>();

        try (InputStream in = Files.newInputStream(csvFilePath);
             InputStreamReader reader = new InputStreamReader(in)) {

            CSVParser parser = new CSVParserBuilder().withSeparator(DELIMITER).build();
            CSVReader csvReader = new CSVReaderBuilder(reader).withCSVParser(parser).build();

            String[] nextLine;
            boolean isFirstLine = true;
            while ((nextLine = csvReader.readNext()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip header line
                }

                if (nextLine.length < 6) {
                    System.err.println("Invalid CSV line: " + String.join(DELIMITER + "", nextLine));
                    continue;
                }

                int personID = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                String sex = nextLine[2];
                String birthday = nextLine[3];
                String departmentName = nextLine[4];
                int salary = Integer.parseInt(nextLine[5]);

                UUID departmentID = departmentUUIDs.computeIfAbsent(departmentName, k -> UUID.randomUUID());
                Department department = new Department(departmentName, departmentID);

                Person person = new Person(personID, name, sex, birthday, salary, department);
                persons.add(person);
            }
        } catch (CsvValidationException e) {
            throw new IOException("Error reading CSV file", e);
        }

        return persons;
    }
}
