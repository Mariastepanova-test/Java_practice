package by.homework.java.task13;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Petrov", "11.02.2000", "Minsk", 8);
        Student student2 = new Student("Pavel", "Smirnov", "02.06.1999", "Grodno", 9);
        Student student3 = new Student("Irina", "Prut", "18.12.1999", "Minsk", 6);
        Student student4 = new Student("Anna", "Ivanova", "14.01.2000", "Novogrudok", 6);

        Group groupA = new Group("Группа A");
        Group groupB = new Group("Группа B");
        groupA.addStudent(student1);
        groupA.addStudent(student3);
        groupB.addStudent(student2);
        groupB.addStudent(student4);

        Faculty itFaculty = new Faculty("Информатика");
        itFaculty.addGroup(groupA);
        itFaculty.addGroup(groupB);
        System.out.println("До удаления студентов с оценкой ниже 7.0: ");
        System.out.println("Группа А: " + groupA.getStudents());
        groupA.removeStudentsByMark(7);
        System.out.println("После удаления студентов с оценкой ниже 7.0: ");
        System.out.println("Группа А: " + groupA.getStudents());


        Group groupC = new Group("Группа C");

        System.out.println("До перевода студентов: ");
        System.out.println("Группа А: " + groupA.getStudents());
        System.out.println("Группа С: " + groupC.getStudents());

        System.out.println("После перевода студентов: ");
        groupA.transferToGroup(groupC);

        System.out.println("Группа А: " + groupA.getStudents());
        System.out.println("Группа С: " + groupC.getStudents());

        itFaculty.addGroup(groupC);

        System.out.println("Средняя оценка группы В: " + groupB.calculateAverageMark());
        System.out.println("Средняя оценка группы A: " + groupA.calculateAverageMark());
        System.out.println("Средняя оценка группы C: " + groupC.calculateAverageMark());

        itFaculty.updateStatus();
        System.out.println(itFaculty);

        itFaculty.studentsByAverageMarkAscending();
        itFaculty.studentsByAverageMarkDescending();
        if (itFaculty.isActive()) {
            System.out.println("Факультет активен.");
        } else {
            System.out.println("Факультет не активен.");
        }
    }

}

