package org.exercises.oop.principles.student;

public final class Aspirant extends Student {
    private final String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5.0) {
            return 2500;
        } else {
            return 2200;
        }
    }
}