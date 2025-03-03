package by.homework.java.task7;


public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "Александр", "Жук", "Биологический", 1, "БФ-1", 8);
        students[1] = new Student(2, "Мария", "Аношко", "Химический", 1, "ХФ-2", 9);
        students[2] = new Student(3, "Виталий", "Смирнов", "Математический", 3, "МФ-5", 7);
        students[3] = new Student(4, "Ирина", "Фирсова", "Экономический", 4, "ЭФ-3", 9);
        students[4] = new Student(5, "Макар", "Буйко", "Филологический", 2, "ФФ-4", 6);


        Student[] highMarkStudents = students[3].getGoodStudents(students, 8);

        for (Student student : highMarkStudents) {
            if (student == null) {
                return;
            }
            student.info();
            System.out.println();
        }
    }
}
