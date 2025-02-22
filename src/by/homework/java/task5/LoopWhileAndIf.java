package by.homework.java.task5;

import java.util.Scanner;

public class LoopWhileAndIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, которое не оканчивается на ноль: ");
        int digit = scanner.nextInt();

            if (digit % 2 == 0) {
                System.out.print("Четная цифра");
            } else {
                System.out.print("Нечетная цифра");
            }
            digit/=10;
        scanner.close();
        }
      }

