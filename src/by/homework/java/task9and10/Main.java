package by.homework.java.task9and10;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Dog dog1 = new Dog("Рекс", "немецкая овчарка", 35, "черный", 12, "мясо");
        Dog dog2 = new Dog("Стелси", "корги", 17, "бело-коричневый", 20, "сухой корм");
        Dog dog3 = new Dog("Шварц", "джек рассел", 11, "бело-коричневый", 15, "сухой корм");
        Bird bird1 = new Bird("Ворон", 50, "черный", 23, "насекомые");
        Bird bird2 = new Bird("Попугай", 30, "желтый", 10, "зерно");
        Bird bird3 = new Bird("Синица", 12, "коричневая", 10, "насекомые");

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);
        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        Animal[] allAnimals = zoo.getAnimals();

        for (Animal animal : allAnimals) {
            animal.voice();
            animal.play();
        }
    }
}



