package by.homework.java.task21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;


public class Time5 {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendText(java.time.temporal.ChronoField.DAY_OF_WEEK, TextStyle.FULL)
                .appendLiteral(" ")
                .appendPattern("d MMMM yyyy")
                .appendLiteral(" время: ")
                .appendPattern("hh.mm.ss a")
                .toFormatter(Locale.forLanguageTag("ru"));

        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println(formattedDateTime);
    }
}
