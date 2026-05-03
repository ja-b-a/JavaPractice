package org.exercises.oop.itogproject.ru.store.online.model.enumeration;

public enum Aroma {
  GRASSY("Травяной"),
  SWEET("Сладкий"),
  RICH("Насыщенный"),
  DELICATE("Деликатный"),
  LIGHT("Лёгкий"),
  FLORAL("Цветочный"),
  HONEY_LIKE("Медовый"),
  FRUITY("Фруктовый"),
  WOODY("Древесный");

  private final String text;

  Aroma(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}