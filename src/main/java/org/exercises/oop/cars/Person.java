package org.exercises.oop.cars;

public class Person {
    private int age;
    private String fullName;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public static String getYearString(int num) {
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
        return "ФИО водителя: " + fullName + "\nВозраст водителя: " + age + " " + getYearString(age);
    }
}