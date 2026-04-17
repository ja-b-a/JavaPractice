package org.exercises.objectconstructor.personobject;

public class PersonObjectRunner {
    public static void main(String[] args) {
        PersonObject person1 = new PersonObject();
        PersonObject person2 = new PersonObject("Илон Маск", 54);

        System.out.println("Тест пользователь 1");
        person1.move();
        person1.talk();

        System.out.println("\nТест пользователь 2");
        person2.move();
        person2.talk();
    }
}