package by.homework.java.task7;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private int course;
    private String group;
    private int averageMark;

    public Student(int id, String name, String surname, String faculty, int course, String group, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;
    }


    public Student() {
        this.id = 0;
        this.name = "студент без имени";
        this.surname = "студент без фамилии";
        this.faculty = "студент без факультета";
        this.course = 1;
        this.group = "студент без группы";
        this.averageMark = 0;
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Средняя оценка: " + averageMark);
        System.out.println();
    }

    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    public String getGroup() {
        return this.group;
    }

    public void changeMarkAndGroup(int newMark, String newGroup) {
        this.averageMark = newMark;
        this.group = newGroup;
    }


    public Student[] getGoodStudents(Student[] students, int mark) {
        Student[] goodStudents = new Student[students.length];
        int index = 0;
        for (Student student : students) {
            if (student.averageMark >= mark) {
                goodStudents[index] = student;
                index = index + 1;
            }
        }
        return goodStudents;
    }
}

