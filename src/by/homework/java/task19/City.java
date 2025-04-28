package by.homework.java.task19;

public class City {
    int id;
    String name;
    int population;
    Continent continent;

    public City(int id, String name, int population, Continent continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return name + " (" + population + ")";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public Continent getContinent() {
        return continent;
    }

}
