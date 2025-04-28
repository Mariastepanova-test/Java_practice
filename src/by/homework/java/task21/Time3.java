package by.homework.java.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time3 {
    public static void main(String[] args) {

        String input = "2023-03-19 : 10:12:24 AM";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd ': 'hh:mm:ss a");

        LocalDateTime localDateTime = LocalDateTime.parse(input, formatter);

        System.out.println("Результат перевода в другой формат: " + localDateTime);
    }

}
