package by.homework.java.task9and10;

public abstract class Animal {

    private String color;
    private int maxLifeExpectancy;
    private String foodType;

    public Animal() {
        this.color = "";
        this.maxLifeExpectancy = 0;
        this.foodType = "";
    }

    public Animal(String color, int maxLifeExpectancy, String foodType) {
        this.color = color;
        this.maxLifeExpectancy = maxLifeExpectancy;
        this.foodType = foodType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxLifeExpectancy() {
        return maxLifeExpectancy;
    }

    public void setMaxLifeExpectancy(int maxLifeExpectancy) {
        this.maxLifeExpectancy = maxLifeExpectancy;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void voice() {
    }

    ;

    public void play() {
    }

    ;

    public String toString() {
        return "Животное{" +
                "окрас='" + color + '\'' +
                ", максимальная продолжительность жизни=" + maxLifeExpectancy +
                ", тип еды, которой питается='" + foodType + '\'' +
                '}';
    }
}


