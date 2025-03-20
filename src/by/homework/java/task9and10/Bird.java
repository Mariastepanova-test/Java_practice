package by.homework.java.task9and10;

import java.util.Objects;

public class Bird extends Animal {
    String birdName;
    int maxFlightAltitude;


    public Bird() {
        this.birdName = "";
        this.maxFlightAltitude = 0;
    }

    public Bird(String birdName, int maxFlightAltitude, String color, int maxLifeExpectancy, String foodType) {
        super(color, maxLifeExpectancy, foodType);
        this.birdName = birdName;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public void setMaxFlightAltitude(int maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }


    @Override
    public void voice() {
        System.out.println(birdName + " поет");
    }

    @Override
    public void play() {
        System.out.println(birdName + " греется на солнышке");
    }

    public void peck() {
        System.out.println(birdName + " клюет");
    }

    public void hatch() {
        System.out.println(birdName + " высиживает птенцов");
    }


    public static void main(String[] args) {
        Animal animal2 = new Bird();
        animal2.voice();
    }

    @Override
    public String toString() {
        return "Семейство птиц: " + birdName + ", максимальная высота полета: " + maxFlightAltitude +
                ", окрас: " + color + ", максимальная продолжительность жизни: " + maxLifeExpectancy +
                ", тип пищи: " + foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return maxFlightAltitude == bird.maxFlightAltitude &&
                birdName.equals(bird.birdName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), birdName, maxFlightAltitude);
        return result;
    }
}


