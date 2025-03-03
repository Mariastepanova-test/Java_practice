package by.homework.java.task5;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое положительное число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе положительное число: ");
        int num2 = scanner.nextInt();

        int sum = 0;
        int firstNum = Math.min(num1, num2);
        int secondNum = Math.max(num1, num2);
        while (firstNum <= secondNum) {
            sum += firstNum;
            firstNum++;
        }
        System.out.println("Cумма всех чисел от " + num1 + " до " + num2 + " включительно: " + sum);
        scanner.close();
    }
}
