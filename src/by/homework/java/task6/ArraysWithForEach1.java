package by.homework.java.task6;

public class ArraysWithForEach1 {
    public static void main(String[] args) {
        int[] massive1 = {1, 2, 3, 4, 5};

        int[] massive2 = new int[massive1.length + 1];

        System.arraycopy(massive1, 0, massive2, 0, massive1.length);
        massive2[massive2.length - 1] = 0;
        System.out.print("Второй массив: ");
        for (int i : massive2) {
            System.out.print(i + " ");
        }
    }
}