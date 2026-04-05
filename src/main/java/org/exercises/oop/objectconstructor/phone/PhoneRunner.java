package org.exercises.oop.objectconstructor.phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535", "iPhone 5s", 112);
        Phone phone2 = new Phone("88001000800", "Samsung Galaxy Z Flip 7", 188);

        System.out.println("Информация о телефонах");
        System.out.println(phone1);
        System.out.println(phone2);

        System.out.println("\nТест 1: телефон 1 звонит на телефон 2");
        phone1.receiveCall(phone2);

        System.out.println("\nТест 2: телефон 2 звонит на телефон 1");
        phone2.receiveCall(phone1);

        System.out.println("\nТест ошибки: звонок самому себе");
        phone1.receiveCall(phone1);
        phone2.receiveCall(phone2);
    }
}