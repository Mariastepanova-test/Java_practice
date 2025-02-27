package by.homework.java.task5;

import java.util.Scanner;

public class LoopWhileAndIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое не оканчивается на ноль: ");
        int number = scanner.nextInt();
        String evennumber = "";
        String oddnumber = "";
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evennumber = digit + " " + evennumber;
            } else {
                oddnumber = digit + " " + oddnumber;
            }
            number /= 10;
        }
        System.out.println("Четные цифры: " + evennumber);
        System.out.println("Нечетные цифры: " + oddnumber);
        scanner.close();
    }
}



