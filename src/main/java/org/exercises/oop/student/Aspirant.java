package org.exercises.oop.student;

public final class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        if (averageMark == 5.0) {
            return 2500;
        } else {
            return 2200;
        }
    }
}