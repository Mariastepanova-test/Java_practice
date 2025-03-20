package by.homework.java.task9and10;

import java.util.Arrays;


public class Zoo {
    private Animal[] animals;

    public Zoo() {
        this.animals = new Animal[0];
    }

    public void addAnimal(Animal animal) {
        Animal[] newArray = Arrays.copyOf(animals, animals.length + 1);
        newArray[newArray.length - 1] = animal;

        animals = newArray;
    }
    public Animal[] getAnimals() {
        return animals;
    }
}
