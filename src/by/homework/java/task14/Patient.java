package by.homework.java.task14;

import java.util.Objects;

public class Patient {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String diagnosis;
    private final int age;
    private final Gender gender;

    public Patient(int id, String firstName, String lastName, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }
    public Gender getGender() {
        return gender;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Пациент{" +
                "ID=" + id +
                ", Имя='" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Диагноз='" + diagnosis + '\'' +
                ", Возраст=" + age +
                ", Пол=" + gender +
                '}';
    }
}
