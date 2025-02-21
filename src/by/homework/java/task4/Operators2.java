package by.homework.java.task4;

import java.util.Scanner;

public class Operators2 {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

               System.out.print("Введите число x: ");
        int x = scanner.nextInt();
        double result = 15.0 / x;

        int R = (int) result;

        switch (R) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:

                System.out.printf("Результат деления равен дробному числу: %.2f", result);
                break;
        }
       scanner.close();
    }
}
