package org.exercises.oop.objectconstructor.phone;

import java.util.Objects;

public class Phone {
    private String number;
    private String model;
    private Integer weight;

    public Phone(String number, String model, Integer weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void receiveCall(Phone caller) {
        if (this.equals(caller)) {
            System.out.println("Ошибка: телефон не может звонить сам себе");
        } else {
            System.out.println("Звонит " + caller.getNumber());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(number, phone.number) && Objects.equals(model, phone.model)
                && Objects.equals(weight, phone.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}