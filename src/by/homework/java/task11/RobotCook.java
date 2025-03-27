package by.homework.java.task11;

public class RobotCook implements Robot {
    private String model;
    private int powerConsumption;
    private String countryOfManufacture;
    private String cookingUnit;
    private boolean isOn;

    public RobotCook(String model, int powerConsumption, String countryOfManufacture, String cookingUnit) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOfManufacture = countryOfManufacture;
        this.cookingUnit = cookingUnit;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
            System.out.println("Робот-повар включен.");


    }

    @Override
    public void turnOff() {
            isOn = false;
        System.out.println("Робот-повар выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Робот повар готовит блюдо.");
    }

    @Override
    public  void repair(){
        System.out.println("Робот-повар отремонтирован.");
    }

    @Override
    public void createItem() {

    }


    @Override
    public String toString() {
        return "CookingRobot{" +
                "model='" + model + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", manufacturerCountry='" + countryOfManufacture + '\'' +
                ", cookingUnit='" + cookingUnit + '\'' +
                '}';
    }
}

