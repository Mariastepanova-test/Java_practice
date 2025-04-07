package by.homework.java.task13;


public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String cityOfBirth;
    private double averageMark;

    public Student(String name, String surname, String dateOfBirth, String cityOfBirth, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.cityOfBirth = cityOfBirth;
        this.averageMark = averageMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageGrade(double averageMark) {
        this.averageMark = averageMark;
    }


    @Override
    public String toString() {
        return "Студент: " +
                "имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                ", дата рождения='" + dateOfBirth + '\'' +
                ", место рождения='" + cityOfBirth + '\'' +
                ", средний балл=" + averageMark;
    }

}
