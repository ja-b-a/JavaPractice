package org.exercises.oop.itogproject.ru.store.online.model;

import java.math.BigDecimal;

public final class CartItem {

  private final Drink drink;
  private Short count;

  public CartItem(Drink drink, Short count) {
    this.drink = drink;
    setCount(count);
  }

  public Drink getDrink() {
    return drink;
  }

  public Short getCount() {
    return count;
  }

  public void setCount(Short count) {
    if (count == null || count <= 0) {
      throw new IllegalArgumentException("Количество должно быть больше 0");
    }
    this.count = count;
  }

  public BigDecimal getTotal() {
    return drink.getPrice().multiply(BigDecimal.valueOf(count));
  }

  @Override
  public String toString() {
    return "CartItem{name: %s, count: %s, total: %s}"
        .formatted(drink.getName(), count, getTotal());
  }
}