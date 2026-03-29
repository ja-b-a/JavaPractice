package org.exercises.oop.itogproject.ru.store.online;

import org.exercises.oop.itogproject.ru.store.online.model.*;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.*;

import java.math.BigDecimal;

public class StoreRunner {
    public static void main(String[] args) {
        User user = new User("Янг", "Лин", "+78005553535", "yoshi_city@gmail.com",
                "sadbooys", "arizona13", Role.CUSTOMER);

        Address address = new Address(Country.JAPAN, "Kyoto", "Kyoto", "Gionmachi", "570",
                "999", "6050074");

        Tea tea = new Tea("Матча", new BigDecimal("300.30"), 1.25f, Manufacturer.ITO_EN,
                Country.JAPAN, PackageType.GIFT, TeaType.MATCHA, Aroma.GRASSY);

        Coffee coffee = new Coffee("Кофе", new BigDecimal("700"), 2.50f, Manufacturer.JACOBS,
                Country.BRAZIL, PackageType.GLASS, CoffeeType.BEAN, Roasting.MEDIUM);

        CartItem cartItem1 = new CartItem(tea, (short) 2);
        CartItem cartItem2 = new CartItem(coffee, (short) 1);
        CartItem[] cartItems = {cartItem1, cartItem2};

        BigDecimal totalPrice = tea.getPrice()
                .multiply(BigDecimal.valueOf(cartItem1.getCount()))
                .add(coffee.getPrice()
                        .multiply(BigDecimal.valueOf(cartItem2.getCount())));

        Order order = new Order(user, address, totalPrice, cartItems);

        System.out.println("Заказ создан");
        System.out.println("Статус: " + order.getStatus());
        System.out.println("Покупатель: " + order.getUser().getName() + " " + order.getUser().getLastName());
        System.out.println("Город: " + order.getAddress().getCity());
        System.out.println("Дата и время заказа: " + order.getOrderDate());
        System.out.println("Стоимость: " + order.getTotalPrice() + " ¥.");

        System.out.println("\nКорзина");
        for (CartItem item : order.getCartItemsArray()) {
            System.out.println(item.getDrink().getName()
                    + ", x" + item.getCount()
                    + ": " + item.getDrink().getPrice() + " ¥./шт.");
        }

        System.out.println("\nСтатус");

        order.setStatus(Status.PAID);
        System.out.println("Заказ оплачен: " + order.getStatus());

        order.setStatus(Status.IN_TRANSIT);
        System.out.println("Заказ в пути: " + order.getStatus());

        order.setStatus(Status.DELIVERED);
        System.out.println("Заказ доставлен: " + order.getStatus());

        order.setStatus(Status.DONE);
        System.out.println("Заказ выполнен: " + order.getStatus());
    }
}