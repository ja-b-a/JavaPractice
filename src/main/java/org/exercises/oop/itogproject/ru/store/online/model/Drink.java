package org.exercises.oop.itogproject.ru.store.online.model;

import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Country;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Manufacturer;
import org.exercises.oop.itogproject.ru.store.online.model.enumeration.PackageType;

import java.math.BigDecimal;

public abstract class Drink {
    private String name;
    private BigDecimal price;
    private Float weight;
    private Manufacturer manufacturer;
    private Country country;
    private PackageType packageType;

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

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }
}