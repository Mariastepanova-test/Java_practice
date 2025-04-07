package by.homework.java.task15;

import java.util.Map;

public class Employee {
    private String idNumber;
    private String name;
    private String surname;
    private int age;
    private double salary;

    public Employee(String idNumber, String name, String surname, int age, double salary) {
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public static void printEmployees(Map<Employee, String> employeeProfession) {
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    static void printEmployeesInfo(Map<Employee, String> employeeProfession) {
        for (Map.Entry<Employee, String> entry : employeeProfession.entrySet()) {
            Employee employee = entry.getKey();
            String profession = entry.getValue();
            System.out.printf("%s %s (%d лет), профессия: %s, зарплата: %.2f руб.\n",
                    employee.getName(), employee.getSurname(),
                    employee.getAge(), profession, employee.getSalary());
        }
    }

    static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equals(profession)) {
                Employee employee = entry.getKey();
                employee.setSalary(employee.getSalary() + amountOfIncrease);

                System.out.println("Зарплата сотрудника " + employee.getName() + " " + employee.getSurname() + " повышена до " + employee.getSalary());
            }
        }

    }

}






