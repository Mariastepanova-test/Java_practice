package by.homework.java.task13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Group> groups;
    private Status status;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.groups = new ArrayList<>();
        this.status = Status.ACTIVE;
    }


    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }


    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Group group : groups) {
            students.addAll(group.getStudents());
        }
        return students;
    }

    public void updateStatus() {
        if (getStudents().size() < 20) {
            setStatus(Status.NOT_ACTIVE);
        } else {
            setStatus(Status.ACTIVE);
        }
    }

    public void addGroup(Group group) {
        groups.add(group);
    }


    public void StudentsByAverageMarkAscending() {
        List<Student> students = getStudents();
        students.sort(Comparator.comparingDouble(Student::getAverageMark));
        System.out.println("Студенты отсортированы по возрастанию среднего балла:");
        for (Student student : students) {
            System.out.println(student.getSurname() + ": средний балл = " + student.getAverageMark());
        }
    }

    public void StudentsByAverageMarkDescending() {
        List<Student> students = getStudents();
        students.sort(Comparator.comparingDouble(Student::getAverageMark).reversed());
        System.out.println("Студенты отсортированы по убыванию среднего балла:");
        for (Student student : students) {
            System.out.println(student.getSurname() + ": средний балл = " + student.getAverageMark());
        }
    }

    public boolean isActive() {
        return status == Status.ACTIVE;

    }

    @Override
    public String toString() {
        return "Название факультета: " + facultyName +
                "\nКоличество студентов: " + getStudents().size() +
                "\nСтатус факультета: " + status.toString();
    }


}
