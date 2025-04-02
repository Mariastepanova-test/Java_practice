package by.homework.java.task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private final String name;
    private final Set<Ward> wards;

    public Department(String name) {
        this.name = name;
        this.wards = new HashSet<>();
    }

    public void addWard(Ward ward) {
        wards.add(ward);
    }

    public int countGender(Gender gender) {
        int count = 0;
        for (Ward ward : wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getGender() == gender) {
                    count++;
                }
            }
        }
        return count;
    }

    public void DepartmentInfo() {
        System.out.println("Отделение: " + name);
        for (Ward ward : wards) {
            ward.printPatients();
        }
    }
}
