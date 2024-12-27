package org.example;

import java.util.UUID;

/**
 * Класс, представляющий департамент.
 */
public class Department {
    private String departmentName;
    private UUID departmentID;

    /**
     * Конструктор для создания объекта Department.
     *
     * @param departmentName Название департамента.
     * @param departmentID   Уникальный идентификатор департамента.
     */
    public Department(String departmentName, UUID departmentID) {
        this.departmentName = departmentName;
        this.departmentID = departmentID;
    }
}
