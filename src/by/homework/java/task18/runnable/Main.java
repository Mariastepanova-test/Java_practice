package by.homework.java.task18.runnable;

import by.homework.java.task18.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Skoda", "0202KL-7", 5000);
        Thread car1thread = new Thread(car1);

        Car car2 = new Car("Audi", "0056PT-2", 4000);
        Car car3 = new Car("KIA", "2256KK-7", 3000);

        Thread car2thread = new Thread(car2);
        Thread car3thread = new Thread(car3);

        car1thread.start();

        try {
            car1thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        car2thread.start();
        car3thread.start();
    }
}
