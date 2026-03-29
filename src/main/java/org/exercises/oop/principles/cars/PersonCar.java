package org.exercises.oop.principles.cars;

public class PersonCar {
    private int age;
    private String fullName;

    public PersonCar(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected String getYearString(int num) {
        int lastNumber = num % 10;
        int lastNumbers = num % 100;

        if (lastNumbers >= 11 && lastNumbers <= 14) {
            return "лет";
        }
        if (lastNumber == 1) {
            return "год";
        } else if (lastNumber >= 2 && lastNumber <= 4) {
            return "года";
        } else {
            return "лет";
        }
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + "\nВозраст: " + age + " " + getYearString(age);
    }
}