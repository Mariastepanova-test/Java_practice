package by.homework.java.task11;

public interface Robot {
    abstract void turnOn();

    abstract void turnOff();

    abstract void uniquePossibility();

    default void repair() {

    }


    void createItem();
}