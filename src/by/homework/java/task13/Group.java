package by.homework.java.task13;

import java.util.List;
import java.util.ArrayList;

public class Group {
    private String groupNumber;
    private List<Student> students;

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return groupNumber +
                ", студенты=" + students;
    }

    public void removeStudentsByMark(int mark) {
        students.removeIf(student -> student.getAverageMark() < mark);
    }

    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.students.addAll(this.students);
            this.students.clear();
        }
    }

    public double calculateAverageMark() {
        if (students.isEmpty()) return 0.0;

        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getAverageMark();
        }
        return totalMarks / students.size();
    }

}





