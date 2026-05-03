package org.exercises.oop.itogproject.ru.store.online.model.enumeration;

public enum TeaType {
  BLACK("Чёрный"),
  WHITE("Белый"),
  GREEN("Зелёный"),
  OOLONG("Улун"),
  PU_ERH("Пуэр"),
  FRUIT("Фруктовый"),
  ROOIBOS("Ройбуш"),
  HIBISCUS("Каркаде"),
  JASMINE("Жасминовый"),
  MATCHA("Матча");

  private final String text;

  TeaType(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}