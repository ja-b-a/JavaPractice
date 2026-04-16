package org.exercises.oop.itogproject.ru.store.online;

import java.math.BigDecimal;
import org.exercises.oop.itogproject.ru.store.online.model.Address;
import org.exercises.oop.itogproject.ru.store.online.model.CartItem;
import org.exercises.oop.itogproject.ru.store.online.model.Coffee;
import org.exercises.oop.itogproject.ru.store.online.model.Order;
import org.exercises.oop.itogproject.ru.store.online.model.Tea;
import org.exercises.oop.itogproject.ru.store.online.model.User;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Aroma;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.CoffeeType;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Country;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Manufacturer;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.PackageType;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Roasting;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Role;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Status;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.TeaType;

public class StoreRunner {

  public static void main(String[] args) {
    User user = new User("Янг", "Лин", "+78005553535", "yoshi_city@gmail.com",
        "sadbooys", "arizona13", Role.CUSTOMER);

    Address address = new Address(Country.JAPAN, "Киото", "Киото", "Гион-мати", "570",
        "999", "6050074");

    Tea tea = new Tea("Матча", new BigDecimal("300.30"), 1.25f, Manufacturer.ITO_EN,
        Country.JAPAN, PackageType.GIFT, TeaType.MATCHA, Aroma.GRASSY);

    Coffee coffee = new Coffee("Кофе", new BigDecimal("700"), 2.50f, Manufacturer.JACOBS,
        Country.BRAZIL, PackageType.GLASS, CoffeeType.BEAN, Roasting.MEDIUM);

    CartItem cartItem1 = new CartItem(tea, (short) 2);
    CartItem cartItem2 = new CartItem(coffee, (short) 1);
    CartItem[] cartItems = {cartItem1, cartItem2};

    Order order = new Order(user, address, cartItems);
    System.out.println("Заказ создан");
    System.out.println("Статус заказа: " + order.getStatus().getText());
    System.out.println(
        "Покупатель: " + order.getUser().getName() + " " + order.getUser().getLastName());
    System.out.println("Город: " + order.getAddress().getCity());
    System.out.println("Корзина:");
    for (CartItem item : order.getCartItemsArray()) {
      System.out.println(item.getDrink().getName()
          + ", x" + item.getCount()
          + ": " + item.getDrink().getPrice() + " ¥/шт.");
    }
    System.out.println("Общая стоимость: " + order.getTotal() + " ¥.");
    System.out.println("Дата и время заказа: " + order.getOrderDate());

    System.out.println("\nДвижение статусов:");

    order.setStatus(Status.PAID);
    System.out.println("Статус заказа: " + order.getStatus().getText());

    order.setStatus(Status.IN_TRANSIT);
    System.out.println("Статус заказа: " + order.getStatus().getText());

    order.setStatus(Status.DELIVERED);
    System.out.println("Статус заказа: " + order.getStatus().getText());

    order.setStatus(Status.DONE);
    System.out.println("Статус заказа: " + order.getStatus().getText());
  }
}