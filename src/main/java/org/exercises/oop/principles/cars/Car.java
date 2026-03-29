package org.exercises.oop.principles.cars;

public class Car {
    private String carClass;
    private Engine engine;
    private Driver driver;
    private String marka;

    public Car(String marka, String carClass, String engineCompany, int enginePower, String driverName,
               int driverAge, int driverExperience) {
        this.carClass = carClass;
        this.engine = new Engine(engineCompany, enginePower);
        this.driver = new Driver(driverName, driverAge, driverExperience);
        this.marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Класс автомобиля: " + carClass + "\n" + engine + "\n" + driver + "\n" + "Марка автомобиля: " + marka;
    }
}