package org.exercises.oop.principles.cars;

public class CarsRunner {
    public static void main(String[] args) {
        Car newCar = new Car("Model S", "Электрокар", "Tesla", 300,
                "Илон Маск", 54, 14);
        System.out.println(newCar);
        System.out.println("Тест-драйв электрокара!");
        newCar.start();
        newCar.turnLeft();
        newCar.turnRight();
        newCar.stop();

        Car newLorry = new Lorry(25, "Volvo FH", "Heavy Commercial Vehicles",
                "Volvo", 420, "Там Далеко Далеко", 45, 22);
        System.out.println("\n" + newLorry);
        System.out.println("Тест-драйв грузовичка!");
        newLorry.start();
        newLorry.turnLeft();
        newLorry.turnRight();
        newLorry.stop();

        Car newSportCar = new SportCar(322, "911 Turbo S", "Supercar", "Porsche",
                701, "Гонщик Нелегальный Профессиональный", 31, 7);
        System.out.println("\n" + newSportCar);
        System.out.println("Тест-драйв суперкара!");
        newSportCar.start();
        newSportCar.turnLeft();
        newSportCar.turnRight();
        newSportCar.stop();
    }
}