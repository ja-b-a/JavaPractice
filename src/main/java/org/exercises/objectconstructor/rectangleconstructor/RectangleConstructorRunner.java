package org.exercises.objectconstructor.rectangleconstructor;

public class RectangleConstructorRunner {
    public static void main(String[] args) {
        RectangleConstructor rectangle1 = new RectangleConstructor(50, 60);
        RectangleConstructor rectangle2 = new RectangleConstructor(rectangle1);

        System.out.println("Прямоугольник 1: " + rectangle1);
        System.out.println("Прямоугольник 2: " + rectangle2);
    }
}