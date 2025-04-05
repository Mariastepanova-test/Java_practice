package by.homework.java.task14;

public class Hospital {
    public static void main(String[] args) {
        Department infection = new Department("Инфекционное");

        Ward ward1 = new Ward(51, RoomType.MALE);
        Ward ward2 = new Ward(52, RoomType.FEMALE);
        Ward ward3 = new Ward(53, RoomType.MALE);

        Patient p1 = new Patient(1, "Эльдар", "Бацуев", "Грипп", 50, Gender.MALE);
        Patient p2 = new Patient(2, "Захар", "Дронь", "Грипп", 55, Gender.FEMALE);
        Patient p3 = new Patient(3, "Сергей", "Кривошеев", "Грипп", 40, Gender.MALE);
        Patient p4 = new Patient(4, "Мария", "Елизарова", "COVID-19", 32, Gender.FEMALE);
        Patient p5 = new Patient(5, "Анна", "Жук", "COVID-19", 45, Gender.FEMALE);
        Patient p6 = new Patient(6, "Эльмира", "Сергеева", "COVID-19", 53, Gender.FEMALE);
        Patient p7 = new Patient(7, "Кирилл", "Кузнецов", "Грипп", 35, Gender.MALE);
        Patient p8 = new Patient(7, "Кирилл", "Кузнецов", "Грипп", 35, Gender.MALE);

        ward1.addPatient(p1);
        ward1.addPatient(p2);
        ward1.addPatient(p3);
        ward1.addPatient(p7);

        ward2.addPatient(p4);
        ward2.addPatient(p5);
        ward2.addPatient(p6);

        ward3.addPatient(p7);
        ward3.addPatient(p8);


        infection.addWard(ward1);
        infection.addWard(ward2);
        infection.addWard(ward3);


        infection.departmentInfo();

        System.out.println("Количество мужчин в отделении: " + infection.countGender(Gender.MALE));
        System.out.println("Количество женщин в отделении: " + infection.countGender(Gender.FEMALE));
    }
}
