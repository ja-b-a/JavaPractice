package org.exercises.oop.principles.cars;

public class Engine {
    private int power;
    private String company;

    public Engine(String company, int power) {
        this.company = company;
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Производитель: " + company + "\nМощность двигателя: " + power + " л.с.";
    }
}