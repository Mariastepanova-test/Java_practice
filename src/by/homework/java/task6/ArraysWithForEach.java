package by.homework.java.task6;

public class ArraysWithForEach {
    public static void main(String[] args) {
        int[] massive = {6, 2, 6, 4, 5, 6, 2, 8, 9, 10};
        System.out.println("Исходный массив:");
        for (int element : massive) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (int i = 0; i < massive.length; i++) {
            if (i % 2 != 0) {
                massive[i] = 0;
            }
        }
        System.out.println("Массив после замены:");
        for (int element : massive) {
            System.out.print(element + " ");
        }
    }
}



