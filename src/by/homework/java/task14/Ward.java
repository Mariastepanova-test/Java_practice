package by.homework.java.task14;

import java.util.HashSet;
import java.util.Set;

public class Ward {
    private final int number;
    private final RoomType type;
    private final Set<Patient> patients;

    public Ward(int number, RoomType type) {
        this.number = number;
        this.type = type;
        this.patients = new HashSet<>();
    }

    public boolean addPatient(Patient patient) {
        if (patients.size() >= 3) {
            System.out.println("Палата №" + number + " уже заполнена.");
            return false;
        }

        if (!patients.isEmpty()) {
            String diagnosis = patients.iterator().next().getDiagnosis();
            if (!diagnosis.equals(patient.getDiagnosis())) {
                System.out.println("Пациент с данным диагнозом - " + patient.getDiagnosis() +
                        " - не может быть добавлен в палату №" + number + " (диагноз для попадания в данную палату должен быть " + diagnosis + ")");
                return false;
            }
        }

        boolean added = patients.add(patient);
        if (!added) {
            System.out.println("Внимание: пациент с ID " + patient.hashCode() + " уже числится в палате №" + number);
        }
        return added;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public RoomType getType() {
        return type;
    }

    public void printPatients() {
        System.out.println("Палата №" + number + " (" + type + "):");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}
