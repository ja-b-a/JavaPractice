package org.exercises.oop.principles.rectangle;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();
        rectangleOne.setWidth(15.5);
        rectangleOne.setHeight(10);

        Rectangle rectangleTwo = new Rectangle();
        rectangleTwo.setWidth(2.2);
        rectangleTwo.setHeight(44.5);

        System.out.println("Площадь первого прямоугольника: " + rectangleOne.calculateArea());
        System.out.println("Периметр второго прямоугольника: " + rectangleTwo.calculatePerimeter());
    }
}