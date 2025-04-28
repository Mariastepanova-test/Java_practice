package by.homework.java.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Time4 {
    public static void main(String[] args) {

        String input = "пн 20.03.23 г. время: 15:07:28";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd.MM.yy 'г.' 'время:' H:m:s");

        LocalDateTime localDateTime = LocalDateTime.parse(input, formatter);

        System.out.println("Результат преобазования: " + localDateTime);
    }

}
