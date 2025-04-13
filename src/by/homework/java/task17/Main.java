package by.homework.java.task17;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        text();
        text1();
        Car car = new Car("Audi", 250, "France");

        String path = "testFolder/car.txt";

        serializeCar(car, "testFolder/car.txt");
        Car deserializedCar = deserializeCar(path);
        System.out.println(deserializedCar);


    }

    private static void serializeCar(Car car, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(car);
        System.out.println("Объет сериализован в файл: " + file);

        } catch (Exception e) {
            throw new RuntimeException("Ошибка.");
        }
    }

    private static Car deserializeCar(String file) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Car car = (Car) objectInputStream.readObject();
            System.out.println("Объект десериализован в файл: " + file);
            return car;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка.");
        }

    }



    private static void text() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:/Java_practice/Practice/textFolder/Textfile.txt");

            int symbol;
            do {
                symbol = fileInputStream.read();
                if (symbol != -1) {
                    System.out.println((char) symbol);
                }
            } while (symbol != -1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден.");
        } catch (IOException e) {
            throw new RuntimeException("Закройте поток.");
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e) {
                throw new RuntimeException("Ошибка.");
            }
        }
    }
    private static void text1() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("textFolder/Textfile.txt");

            int symbol;
            do {
                symbol = fileInputStream.read();
                if (symbol != -1) {
                    System.out.println((char) symbol);
                }
            } while (symbol != -1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден.");
        } catch (IOException e) {
            throw new RuntimeException("Закройте поток.");
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e) {
                throw new RuntimeException("Ошибка.");
            }
        }
    }
}






