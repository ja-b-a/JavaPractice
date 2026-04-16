package org.exercises.oop.itogproject.ru.store.online.model.enumeration;

public enum Roasting {
  LIGHT("Лёгкая"),
  MEDIUM("Средняя"),
  MEDIUM_DARK("Средне-тёмная"),
  DARK("Тёмная");

  private final String text;

  Roasting(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}