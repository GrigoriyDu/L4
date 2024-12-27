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

    /**
     * Возвращает название департамента.
     *
     * @return Название департамента.
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Возвращает уникальный идентификатор департамента.
     *
     * @return Уникальный идентификатор департамента.
     */
    public UUID getDepartmentID() {
        return departmentID;
    }

    /**
     * Возвращает строковое представление объекта Department.
     *
     * @return Строковое представление объекта Department.
     */
    @Override
    public String toString() {
        return "Department{departmentName='" + departmentName + "', departmentID=" + departmentID + "}";
    }
}
