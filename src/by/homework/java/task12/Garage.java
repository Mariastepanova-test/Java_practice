package by.homework.java.task12;

public class Garage<T extends Vehicle> {
    private final T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEntryPermitted() {
        return vehicle.getEmissions() <= 100;
    }

       public T getVehicle() {
        return vehicle;
    }
}