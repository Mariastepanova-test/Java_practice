package by.homework.java.task5;

import java.util.Scanner;

public class LoopWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое не оканчивается на ноль: ");
        int number = scanner.nextInt();
        System.out.print("Вывести число в обратном порядке: ");
        while (number > 0) {
            int newNumber = number % 10;
            System.out.print(newNumber);
            number /= 10;
        }
        scanner.close();
    }
}
