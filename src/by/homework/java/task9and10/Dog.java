package by.homework.java.task9and10;

import java.util.Objects;

public class Dog extends Animal {

    private String name;
    private String dogBreed;
    private int weight;


    public Dog(String name, String dogBreed, int weight, String color, int maxLifeExpectancy, String foodType) {
        super(color, maxLifeExpectancy, foodType);
        this.name = name;
        this.dogBreed = dogBreed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return dogBreed;
    }

    public void setBreed(String breed) {
        this.dogBreed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double averageWeight) {
        this.weight = weight;
    }


    @Override
    public void voice() {
        System.out.println(name + " лает");
    }

    @Override
    public void play() {
        System.out.println(name + " играется");
    }

    public void bite() {
        System.out.println(name + " кусается");
    }

    public void run() {
        System.out.println(name + " бегает");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ", порода: " + dogBreed + ", вес: " + weight + ", окрас: " + color + ", максимальная продолжительность жизни: " + maxLifeExpectancy +
                ", тип пищи: " + foodType;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) return false;

        Dog dog = (Dog) obj;
        if (dogBreed.equals(dog.getBreed())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = dogBreed.hashCode();
        return result;
    }
}






