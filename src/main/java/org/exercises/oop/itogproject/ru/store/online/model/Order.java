package org.exercises.oop.itogproject.ru.store.online.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Status;

public final class Order {

  private final LocalDateTime orderDate;
  private final User user;
  private Address address;
  private Status status;
  private final CartItem[] cartItemsArray;

  public Order(User user, Address address, CartItem[] cartItemsArray) {
    this.orderDate = LocalDateTime.now();
    this.user = user;
    this.address = address;
    this.status = Status.NEW;
    this.cartItemsArray = cartItemsArray;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public User getUser() {
    return user;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public CartItem[] getCartItemsArray() {
    return cartItemsArray;
  }

  public BigDecimal getTotal() {
    BigDecimal total = BigDecimal.valueOf(0);
    for (CartItem c : cartItemsArray) {
      total = total.add(c.getTotal());
    }
    return total;
  }

  @Override
  public String toString() {
    return "Order{user: %s, status: %s, totalPrice: %s}"
        .formatted(user.getName() + " " + user.getLastName(), status.getText(), getTotal());
  }
}