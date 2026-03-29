package org.exercises.oop.itogproject.ru.store.online.model;

import org.exercises.oop.itogproject.ru.store.online.model.enumeration.*;

import java.math.BigDecimal;

public class Coffee extends Drink {
    private CoffeeType coffeeType;
    private Roasting roasting;

    public Coffee(String name, BigDecimal price, Float weight, Manufacturer manufacturer, Country country,
                  PackageType packageType, CoffeeType coffeeType, Roasting roasting) {
        super(name, price, weight, manufacturer, country, packageType);
        this.coffeeType = coffeeType;
        this.roasting = roasting;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public Roasting getRoasting() {
        return roasting;
    }

    public void setRoasting(Roasting roasting) {
        this.roasting = roasting;
    }
}