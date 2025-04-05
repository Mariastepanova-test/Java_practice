package by.homework.java.task15;

import java.util.HashMap;
import java.util.Map;

import static by.homework.java.task15.Employee.raiseSalaryForProfession;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("456123ZX0", "Филипп", "Парамонов", 26, 5500);
        Employee employee2 = new Employee("741123NM3", "Ольга", "Неизвестная", 41, 4800);
        Employee employee3 = new Employee("456785CV2", "Оксана", "Александрова", 36, 3600);
        Employee employee4 = new Employee("521101MM2", "Алексей", "Скоробогатов", 54, 5600);
        Employee employee5 = new Employee("566441ZX1", "Виктория", "Юхновец", 33, 3200);
        Employee employee6 = new Employee("458788VV1", "Олег", "Орлов", 35, 5600);
        Employee employee7 = new Employee("789147XC2", "Анна", "Павлова", 25, 5700);
        Employee employee8 = new Employee("123474SS0", "Инна", "Петрова", 29, 3200);

        Map<Employee, String> employeeProfession = new HashMap<>();

        employeeProfession.put(employee1, "DevOps-инженер");
        employeeProfession.put(employee2, "Системный аналитик");
        employeeProfession.put(employee3, "Тестировщик");
        employeeProfession.put(employee4, "Системный администратор");
        employeeProfession.put(employee5, "Бизнес аналитик");
        employeeProfession.put(employee6, "DevOps-инженер");
        employeeProfession.put(employee7, "DevOps-инженер");
        employeeProfession.put(employee8, "Мобильный разработчик");

        System.out.println("Сотрудники до повышения зарплаты:");
        Employee.printEmployeesInfo(employeeProfession);


        raiseSalaryForProfession(employeeProfession, "DevOps-инженер", 1000);


        System.out.println("Информация по сотрудникам после повышения зарплаты:");
        Employee.printEmployeesInfo(employeeProfession);
    }
}




