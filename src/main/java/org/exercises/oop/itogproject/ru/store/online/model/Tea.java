package org.exercises.oop.itogproject.ru.store.online.model;

import org.exercises.oop.itogproject.ru.store.online.model.enumeration.*;

import java.math.BigDecimal;

public class Tea extends Drink {
    private TeaType teaType;
    private Aroma aroma;

    public Tea(String name, BigDecimal price, Float weight, Manufacturer manufacturer, Country country,
               PackageType packageType, TeaType teaType, Aroma aroma) {
        super(name, price, weight, manufacturer, country, packageType);
        this.teaType = teaType;
        this.aroma = aroma;
    }

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public Aroma getAroma() {
        return aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }
}