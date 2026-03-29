package org.exercises.oop.principles.person;

public class PersonRunner {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.name = "Иван";
        personOne.age = 25;

        Person personTwo = new Person();
        personTwo.name = "Анна";
        personTwo.age = 32;

        System.out.println("Имя 1: " + personOne.name + "\nВозраст 1: " + personOne.age);
        System.out.println("\nИмя 2: " + personTwo.name + "\nВозраст 2: " + personTwo.age);
    }
}