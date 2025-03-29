package by.homework.java.task11;

public class Main {
    public static void main(String[] args) {
        RobotCook robotCook = new RobotCook("CookModel56", 1400, "USA", "Гриль");
        RobotSapper robotSapper = new RobotSapper("SapperModel85", 1400, "Взрыв", "Металл");
        RobotBuilder robotBuilder = new RobotBuilder("BuilderModel44", 2000, "Germany", "Шуруповерт");

        robotSapper.repair();
        robotBuilder.repair();
        robotCook.repair();


        Robot[] allRobotsExhibition = new Robot[]{
                robotCook,
                robotSapper,
                robotBuilder
        };

        final RobotEngineer[] engineeringRobotsExhibition = {
                robotSapper,
                robotBuilder
        };


        RobotSapper[] sapperRobotsExhibition = {robotSapper};

        System.out.println("Выставка 1 - все роботы:");
        for (
                Robot robot : allRobotsExhibition) {
            robot.uniquePossibility();
        }

        System.out.println("Выставка 2 - роботы инженеры:");
        for (RobotEngineer engineer : engineeringRobotsExhibition) {
            engineer.createItem();
        }

        System.out.println("Выставка 3 - роботы саперы:");
        for (RobotSapper sapper : sapperRobotsExhibition) {
            sapper.uniquePossibility();
        }
    }
}


