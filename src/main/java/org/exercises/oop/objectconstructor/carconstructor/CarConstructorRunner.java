package org.exercises.oop.objectconstructor.carconstructor;

public class CarConstructorRunner {
    public static void main(String[] args) {
        CarConstructor car1 = new CarConstructor("Tesla Model 3", 2016);
        CarConstructor car2 = new CarConstructor(null, null);

        System.out.println("Машина 1: " + car1);
        System.out.println("Машина 2: " + car2);
    }
}