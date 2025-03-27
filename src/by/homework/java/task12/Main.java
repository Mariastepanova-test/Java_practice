package by.homework.java.task12;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Nissan", 110);
        Motorcycle motorcycle = new Motorcycle("Honda", 90);

        Garage<Car> garageCar = new Garage<>(car);
        Garage<Motorcycle> garageMotorcycle = new Garage<>(motorcycle);

         System.out.println(garageCar.getVehicle().getName() + ": " +
                (garageCar.isEntryPermitted() ? "въезд разрешён" : "въезд запрещён"));

        System.out.println(garageMotorcycle.getVehicle().getName() + ": " +
                (garageMotorcycle.isEntryPermitted() ? "въезд разрешён" : "въезд запрещён"));
    }
}