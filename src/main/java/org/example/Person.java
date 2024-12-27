package org.example;

/**
 * Класс, представляющий человека.
 */
public class Person {
    private final int personID;
    private final String name;
    private final String sex;
    private final String birthday;
    private final Department department;
    private final int salary;

    /**
     * Конструктор для создания объекта Person.
     *
     * @param personID   Уникальный идентификатор человека.
     * @param name       Имя человека.
     * @param sex        Пол человека.
     * @param birthday   Дата рождения человека.
     * @param salary     Зарплата человека.
     * @param department Департамент, к которому принадлежит человек.
     */
    public Person(int personID, String name, String sex, String birthday, int salary, Department department) {
        this.personID = personID;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.salary = salary;
        this.department = department;
    }
}
