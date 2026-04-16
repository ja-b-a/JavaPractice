package org.exercises.oop.itogproject.ru.store.online.model.enumeration;

public enum Country {
  CHINA("Китай"),
  INDIA("Индия"),
  JAPAN("Япония"),
  KENYA("Кения"),
  BRAZIL("Бразилия"),
  VIETNAM("Вьетнам"),
  ETHIOPIA("Эфиопия"),
  PERU("Перу"),
  MEXICO("Мексика");

  private final String text;

  Country(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}