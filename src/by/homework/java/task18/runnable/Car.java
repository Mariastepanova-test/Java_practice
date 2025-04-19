package by.homework.java.task18.runnable;

public class Car implements Runnable {
    private final String brand;
    private final String number;
    private final int stopTime;
    private final int driveDuration;

    public Car(String brand, String number, int stopTime, int driveDuration) {
        this.brand = brand;
        this.number = number;
        this.stopTime = stopTime;
        this.driveDuration = driveDuration;
    }

    @Override
    public void run() {
        try {
            System.out.println(brand + " [" + number + "] начинает движение.");
            int counter = 0;
            while (counter < driveDuration / 1000) {
                System.out.println(brand + " едет... " + (counter + 1));
                Thread.sleep(1000);
                counter++;
            }
            System.out.println(brand + " остановилась. Время остановки: " + stopTime);
            Thread.sleep(stopTime);
            System.out.println(brand + " снова готова к движению.");
        } catch (InterruptedException e) {
            System.out.println(brand + " была прервана.");
        }
    }
}