package by.homework.java.task4;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        System.out.println("Четные числа: ");
        if (num1 % 2 == 0) System.out.println(num1);
        if (num2 % 2 == 0) System.out.println(num2);
        if (num3 % 2 == 0) System.out.println(num3);
        scanner.close();
        }

    }





