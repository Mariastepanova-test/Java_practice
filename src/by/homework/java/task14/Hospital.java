package by.homework.java.task14;

public class Hospital {
    public static void main(String[] args) {
        Department infection = new Department("Инфекционное отделение");

        Ward ward1 = new Ward(51, RoomType.МУЖ);
        Ward ward2 = new Ward(52, RoomType.ЖЕН);
        Ward ward3 = new Ward(53, RoomType.МУЖ);

        Patient p1 = new Patient(1, "Эльдар", "Бацуев", "Грипп", 50, Gender.МУЖСКОЙ);
        Patient p2 = new Patient(2, "Захар", "Дронь", "Грипп", 55, Gender.МУЖСКОЙ);
        Patient p3 = new Patient(3, "Сергей", "Кривошеев", "Грипп", 40, Gender.МУЖСКОЙ);
        Patient p4 = new Patient(4, "Мария", "Елизарова", "COVID-19", 32, Gender.ЖЕНСКИЙ);
        Patient p5 = new Patient(5, "Анна", "Жук", "COVID-19", 45, Gender.ЖЕНСКИЙ);
        Patient p6 = new Patient(6, "Эльмира", "Сергеева", "COVID-19", 53, Gender.ЖЕНСКИЙ);
        Patient p7 = new Patient(7, "Кирилл", "Кузнецов", "Грипп", 35, Gender.МУЖСКОЙ);
        Patient p8 = new Patient(7, "Кирилл", "Кузнецов", "Грипп", 35, Gender.МУЖСКОЙ);

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


        infection.DepartmentInfo();


        System.out.println("Количество мужчин в отделении: " + infection.countGender(Gender.МУЖСКОЙ));
        System.out.println("Количество женщин в отделении: " + infection.countGender(Gender.ЖЕНСКИЙ));
    }
}
