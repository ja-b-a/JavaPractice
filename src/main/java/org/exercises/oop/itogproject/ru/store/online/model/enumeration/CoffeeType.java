package org.exercises.oop.itogproject.ru.store.online.model.enumeration;

public enum CoffeeType {
  GROUND("Молотый"),
  BEAN("Зерновой"),
  ROASTED_BEAN("Обжаренное зерно"),
  ROASTED_GROUND("Обжаренный молотый"),
  DRIP("Дрип"),
  INSTANT("Растворимый"),
  PODS("Капсульный");

  private final String text;

  CoffeeType(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}