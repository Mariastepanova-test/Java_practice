package by.homework.java.task19;


import java.util.Comparator;
import java.util.List;

public class CityOrganization {

    public static void main(String[] args) {
        List<City> cities = List.of(
                new City(1, "Minsk", 1967330, Continent.EUROPE),
                new City(2, "Paris", 2274000, Continent.EUROPE),
                new City(3, "Tokyo", 14043239, Continent.ASIA),
                new City(4, "Jakarta", 10562088, Continent.ASIA),
                new City(5, "Lagos", 13745000, Continent.AFRICA),
                new City(6, "Cairo", 9840935, Continent.AFRICA),
                new City(7, "Melbourne", 5159211, Continent.AUSTRALIA),
                new City(8, "Sydney", 5260000, Continent.NORTH_AMERICA),
                new City(9, "New York", 8363710, Continent.NORTH_AMERICA),
                new City(10, "Mexico", 19720916, Continent.NORTH_AMERICA)
        );

        cities.stream()
                .filter(c -> c.getContinent() == Continent.EUROPE)
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(c -> System.out.println("Самый густонаселённый город на континенте EUROPE: " + c));


        cities.stream()
                .filter(c -> c.getContinent() == Continent.AFRICA)
                .min(Comparator.comparingInt(City::getPopulation))
                .ifPresent(c -> System.out.println("Город с минимальным населением на континенте AFRICA: " + c));


        cities.stream()
                .max(Comparator.comparingInt(City::getPopulation))
                .ifPresent(c -> System.out.println("Самый густонаселенный город: " + c));


        cities.stream()
                .min(Comparator.comparingInt(City::getPopulation))
                .ifPresent(c -> System.out.println("Город с самым маленьким населением: " + c));


        cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .findFirst()
                .ifPresent(c -> System.out.println("Первый попавшийся город с населением больше 1 млн: " + c));


        List<City> overMillion = cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .toList();
        System.out.println("Города с населением больше 1 млн: " + overMillion);


        List<String> cityNames = cities.stream()
                .map(City::getName)
                .toList();
        System.out.println("Коллекция названий городов: " + cityNames);
    }
}




