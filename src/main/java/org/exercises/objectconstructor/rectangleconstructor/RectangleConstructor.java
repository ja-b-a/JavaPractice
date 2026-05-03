package org.exercises.objectconstructor.rectangleconstructor;

import java.util.Objects;

public class RectangleConstructor {
    private Integer width;
    private Integer height;

    public RectangleConstructor(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public RectangleConstructor(RectangleConstructor other) {
        if (this == other) {
            System.out.println("Ошибка уникальности");
            return;
        }
        this.width = other.width;
        this.height = other.height;
    }

    public Integer getWidth() {
        return width;
    }

    private void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    private void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleConstructor rectangle = (RectangleConstructor) o;
        return Objects.equals(width, rectangle.width) && Objects.equals(height, rectangle.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "RectangleConstructor{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}