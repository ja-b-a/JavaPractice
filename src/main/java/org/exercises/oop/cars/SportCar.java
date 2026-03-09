package org.exercises.oop.cars;

public final class SportCar extends Car {
    private double speed;

    public SportCar(double speed, String marka, String carClass, String engineCompany, int enginePower,
                    String driverName, int driverAge, int driverExperience) {
        super(marka, carClass, engineCompany, enginePower, driverName, driverAge, driverExperience);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nСкорость: " + speed + " км/ч";
    }
}