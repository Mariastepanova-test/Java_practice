package by.homework.java.task6;

import java.util.Arrays;

public class ArraysExtra2 {
    public static void main(String[] args) {
        int[] massive = {2, 17, -3, 7, 0, 8, 4};
        Arrays.sort(massive);
        for (int values : massive) {
            System.out.print(values + " ");
        }
    }
}
