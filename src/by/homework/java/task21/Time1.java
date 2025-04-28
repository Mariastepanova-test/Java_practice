package by.homework.java.task21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Time1 {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        String formattedDate = currentDate.format(formatter);

        System.out.println("Текущая дата: " + formattedDate);
    }

}
