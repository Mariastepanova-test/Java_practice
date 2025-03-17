package by.homework.java.task8;

import static by.homework.java.task8.String1.processStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String Str1 = scanner.nextLine().trim();

        System.out.print("Введите вторую строку: ");
        String Str2 = scanner.nextLine().trim();

        String result = processStrings(Str1, Str2);
        System.out.println("Результат: " + result);

    }
}
