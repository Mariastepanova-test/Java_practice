package by.homework.java.task6;

import java.util.Arrays;

public class ArraysExtra1 {
    public static void main(String[] args) {
        int[] massive = {2, 8, -3, 7, 9, -8, 4};
        System.out.println("Исходный массив:");
        for (int element : massive) {
            System.out.print(element + " ");
        }
        System.out.println();
        int min = 0, max = 0;
        for (int i = 1; i < massive.length; i++) {
            if (massive[i] < massive[min]) {
                min = i;
            }
            if (massive[i] > massive[max]) {
                max = i;
            }
        }
        massive[min] = -1000;
        massive[max] = 1000;

        System.out.println("Новый массив:");
        for (int element : massive) {
            System.out.print(element + " ");
        }
    }
}

