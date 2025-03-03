package by.homework.java.task6;

import java.util.Arrays;

import java.util.Arrays;

public class ArraysWithForEach1 {
    public static void main(String[] args) {
        int[] massive1 = {1, 2, 3, 4, 5};
        int[] massive2 = new int[massive1.length + 1];
        for (int i = 0; i < massive1.length; i++) {
            massive2[i] = massive1[i];
        }
        System.out.println("Измененный массив: ");
        {
            System.out.println(Arrays.toString(massive2));
        }
    }
}