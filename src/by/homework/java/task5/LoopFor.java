package by.homework.java.task5;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0) {
                System.out.println(i);            }
        }
    }
}
