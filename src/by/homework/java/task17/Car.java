package by.homework.java.task17;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String brand;
    private int maxSpeed;
    private String country;

    public Car(String brand, int maxSpeed, String country) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Car))
            return false;
        Car car = (Car) obj;
        return brand.equals(car.brand) && maxSpeed == car.maxSpeed && country.equals(car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, maxSpeed, country);
    }


    @Override
    public String toString() {
        return "Car [марка автомобиля = " + brand + ", максимальная скорость = " + maxSpeed + ", страна производства = " + country + "]";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountryOfProduction() {
        return country;
    }

    public void setCountryOfProduction(String country) {
        this.country = country;
    }
}
