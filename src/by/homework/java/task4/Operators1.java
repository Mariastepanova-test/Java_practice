package by.homework.java.task4;

import java.util.Scanner;
public class Operators1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("Числа, которые делятся на 2 и на 5: ");
        if (num1 % 2 == 0 && num1 % 5 == 0) System.out.println(num1);
        if (num2 % 2 == 0 && num2 % 5 == 0) System.out.println(num2);
        if (num3 % 2 == 0 && num3 % 5 == 0) System.out.println(num3);

        scanner.close();
    }
}