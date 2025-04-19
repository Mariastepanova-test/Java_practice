package by.homework.java.task18;

public class Main {
    public static void main(String[] args) {
        startTraffic();
    }

    private static void startTraffic() {
        Car car1 = new Car("Skoda", "0202KL-7", 1000);
        Car car2 = new Car("Audi", "0056PT-2", 1200);


        Car car3 = new Car("KIA", "2256KK-7", 1500);


        runFirstCar(car1);
        runAfterFirstCar(car1, car2, car3);
    }

    private static void runFirstCar(Car car) {
        car.start();
    }

    private static void runAfterFirstCar(Car first, Car car2, Car car3) {
        try {
            first.join();
            car2.start();
            car3.start();
        } catch (InterruptedException e) {
            System.out.println("Поток прерван.");
        }
    }
}






