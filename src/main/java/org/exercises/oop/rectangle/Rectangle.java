package org.exercises.oop.rectangle;

public class Rectangle {
    private double width;
    private double height;

    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    public double calculateArea() {
        return width * height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}