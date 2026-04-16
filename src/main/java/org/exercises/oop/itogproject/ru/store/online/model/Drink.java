package org.exercises.oop.itogproject.ru.store.online.model;

import java.math.BigDecimal;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Country;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Manufacturer;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.PackageType;

public abstract class Drink {

  private final String name;
  private final BigDecimal price;
  private final Float weight;
  private final Manufacturer manufacturer;
  private final Country country;
  private final PackageType packageType;

  public Drink(String name, BigDecimal price, Float weight, Manufacturer manufacturer,
      Country country, PackageType packageType) {
    this.name = name;
    this.price = price;
    this.weight = weight;
    this.manufacturer = manufacturer;
    this.country = country;
    this.packageType = packageType;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public Float getWeight() {
    return weight;
  }

  public Country getCountry() {
    return country;
  }

  public Manufacturer getManufacturer() {
    return manufacturer;
  }

  public PackageType getPackageType() {
    return packageType;
  }

  @Override
  public String toString() {
    return "Drink{name: %s, price: %s, weight: %s, manufacturer: %s, country: %s, packageType: %s}"
        .formatted(name, price, weight, manufacturer.getText(), country.getText(),
            packageType.getText());
  }
}