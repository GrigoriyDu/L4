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

    /**
     * Возвращает уникальный идентификатор человека.
     *
     * @return Уникальный идентификатор человека.
     */
    public int getPersonID() {
        return personID;
    }

    /**
     * Возвращает имя человека.
     *
     * @return Имя человека.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает пол человека.
     *
     * @return Пол человека.
     */
    public String getSex() {
        return sex;
    }

    /**
     * Возвращает дату рождения человека.
     *
     * @return Дата рождения человека.
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Возвращает департамент, к которому принадлежит человек.
     *
     * @return Департамент, к которому принадлежит человек.
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Возвращает зарплату человека.
     *
     * @return Зарплата человека.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Возвращает строковое представление объекта Person.
     *
     * @return Строковое представление объекта Person.
     */
    @Override
    public String toString() {
        return "Person{personID=" + personID + ", name='" + name + "', sex='" + sex + "', birthday='" + birthday + "', department=" + department + ", salary=" + salary + "}";
    }
}
