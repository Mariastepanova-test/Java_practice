package by.homework.java.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time2 {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a");
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Текущая дата и время: " + formattedDateTime);
    }
}
