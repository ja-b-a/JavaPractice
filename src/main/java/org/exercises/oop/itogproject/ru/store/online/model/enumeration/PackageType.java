package org.exercises.oop.itogproject.ru.store.online.model.enumeration;

public enum PackageType {
  PAPER("Бумажная"),
  PLASTIC("Пластиковая"),
  GIFT("Подарочная"),
  BOX("Коробка"),
  METAL("Метлаллическая"),
  GLASS("Стеклянная");

  private final String text;

  PackageType(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}