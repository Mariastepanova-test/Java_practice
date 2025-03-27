package by.homework.java.task11;

public class RobotBuilder implements RobotEngineer {
    private String model;
    private int powerConsumption;
    private String countryOfManufacture;
    private String constructionUnit;
    private String material;
    private boolean isOn;

    public RobotBuilder(String model, int powerConsumption, String countryOfManufacture, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.constructionUnit = constructionUnit;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот-строитель включен.");


    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Робот-строитель выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Робот-строитель строит.");
    }

    @Override
    public void repair() {
        System.out.println("Робот-строитель отремонтирован.");
    }

    @Override
    public void createItem() {
        System.out.println("Робот-cтроитель создаёт бетон.");
    }

    @Override
    public String toString() {
        return "CookingRobot{" +
                "model='" + model + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", manufacturerCountry='" + countryOfManufacture +
                ", constructionUnit='" + constructionUnit + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
