package org.exercises.oop.principles.cars;

public class Driver extends PersonCar {
    private int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + "\nСтаж вождения: " + experience + " " + getYearString(experience);
    }
}