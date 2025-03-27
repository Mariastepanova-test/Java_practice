package by.homework.java.task11;

public class RobotSapper implements RobotEngineer {
    private String model;
    private int powerConsumption;
    private String deminingTool;
    private String material;
    private boolean isOn;

    public RobotSapper(String model, int powerConsumption, String deminingTool, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.deminingTool = deminingTool;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот-сапер включен.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Робот-повар выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println("Робот-сапер разминирует здание.");
    }

    @Override
    public void repair() {
        System.out.println("Робот-сапер отремонтирован.");
    }

    @Override
    public void createItem() {
        System.out.println("Робот-сапер создает приспособление для разминирования.");
    }

    @Override
    public String toString() {
        return "RobotSapper{" +
                "model='" + model + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", deminingTool='" + deminingTool + '\'' +
                ", material='" + material + '\'' +
                '}';

    }
}