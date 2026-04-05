package org.exercises.oop.objectconstructor.personobject;

public class PersonObject {
    private String fullName;
    private Integer age;

    public PersonObject() {
        this.fullName = "Неизвестный";
        this.age = 0;
    }

    public PersonObject(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " движется");
    }

    public void talk() {
        System.out.println(fullName + ", возраст " + age + " говорит");
    }
}