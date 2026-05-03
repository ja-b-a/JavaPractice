package org.exercises.oop.itogproject.ru.store.online.model;

import java.math.BigDecimal;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.CoffeeType;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Country;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Manufacturer;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.PackageType;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Roasting;

public final class Coffee extends Drink {

  private final CoffeeType coffeeType;
  private final Roasting roasting;

  public Coffee(String name, BigDecimal price, Float weight, Manufacturer manufacturer,
      Country country,
      PackageType packageType, CoffeeType coffeeType, Roasting roasting) {
    super(name, price, weight, manufacturer, country, packageType);
    this.coffeeType = coffeeType;
    this.roasting = roasting;
  }

  public CoffeeType getCoffeeType() {
    return coffeeType;
  }

  public Roasting getRoasting() {
    return roasting;
  }

  @Override
  public String toString() {
    return super.toString() + ", coffeeType=" + coffeeType.getText() + ", roasting="
        + roasting.getText();
  }
}