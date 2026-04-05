package org.exercises.oop.objectconstructor.carconstructor;

public class CarConstructor {
    private String model;
    private Integer year;

    public CarConstructor(String model, Integer year) {
        this.model = (model != null) ? model : "Неизвестно";
        this.year = (year != null) ? year : 0;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "CarConstructor{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}