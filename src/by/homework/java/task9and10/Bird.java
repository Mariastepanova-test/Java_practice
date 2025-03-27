package by.homework.java.task9and10;

import java.util.Objects;

public class Bird extends Animal {
    private String birdName;
    private int maxFlightAltitude;


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


    @Override
    public String toString() {
        return "Семейство птиц: " + birdName + ", максимальная высота полета: " + maxFlightAltitude +
                ", окрас: " + color + ", максимальная продолжительность жизни: " + maxLifeExpectancy +
                ", тип пищи: " + foodType;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) obj;
        if (birdName.equals(bird.getBirdName())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = birdName.hashCode();
        return result;
    }
}



