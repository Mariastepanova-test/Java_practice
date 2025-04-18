package by.homework.java.task18;

public class Car extends Thread {
    private final String brand;
    private final String number;
    private final int stopTime;

    public Car(String brand, String number, int stopTime) {
        this.brand = brand;
        this.number = number;
        this.stopTime = stopTime;

    }

    @Override
    public void run() {
        try {
            System.out.println(brand + " с номером " + number + " начала движение.");
            for (int i = 0; i < 5; i++) {
                System.out.println(brand + " едет... " + (i + 1));
                Thread.sleep(stopTime);
            }
            System.out.println(brand + " остановилась.");
        } catch (InterruptedException e) {
            System.out.println(brand + " была прервана.");
        }
    }

    public String getNumber() {
        return number;
    }
}
