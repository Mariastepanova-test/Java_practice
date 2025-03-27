package by.homework.java.task9and10;

public class Zoo {
    private Animal[] animals;


    public Zoo() {
        animals = new Animal[0];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        if (animals == null) {
            animals = new Animal[1];
            animals[0] = animal;
        } else {
            Animal[] copyAnimals = new Animal[animals.length + 1];
            for (int i = 0; i < animals.length; i++) {
                copyAnimals[i] = animals[i];
            }
            copyAnimals[animals.length] = animal;
            animals = copyAnimals;
        }
    }
}
