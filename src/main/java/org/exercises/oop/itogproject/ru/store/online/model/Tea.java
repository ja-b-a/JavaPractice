package org.exercises.oop.itogproject.ru.store.online.model;

import java.math.BigDecimal;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Aroma;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Country;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Manufacturer;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.PackageType;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.TeaType;

public final class Tea extends Drink {

  private final TeaType teaType;
  private final Aroma aroma;

  public Tea(String name, BigDecimal price, Float weight, Manufacturer manufacturer,
      Country country,
      PackageType packageType, TeaType teaType, Aroma aroma) {
    super(name, price, weight, manufacturer, country, packageType);
    this.teaType = teaType;
    this.aroma = aroma;
  }

  public TeaType getTeaType() {
    return teaType;
  }

  public Aroma getAroma() {
    return aroma;
  }

  @Override
  public String toString() {
    return super.toString() + ", teaType=" + teaType.getText() + ", aroma=" + aroma.getText();
  }
}