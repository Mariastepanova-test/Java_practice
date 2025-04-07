package by.homework.java.task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;
    private final Set<Ward> wards;
    Department infection;

    public Department(String name) {
        this.name = name;
        this.wards = new HashSet<>();
    }

    public void addWard(Ward ward) {
        wards.add(ward);
    }

    private int getPatientsFromWard(Ward ward, Gender gender) {
        int count = 0;
        for (Patient patient : ward.getPatients()) {
            if (patient.getGender() == gender) {
                count++;
            }
        }
        return count;
    }

    public int countGender(Gender gender) {
        int count = 0;
        for (Ward ward : wards) {
            count += getPatientsFromWard(ward, gender);

        }
        return count;
    }

    public void departmentInfo() {
        System.out.println("Отделение: " + name);
        for (Ward ward : wards) {
            ward.printPatients();
        }
    }
}
