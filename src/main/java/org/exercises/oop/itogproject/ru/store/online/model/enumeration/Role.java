package org.exercises.oop.itogproject.ru.store.online.model.enumeration;

public enum Role {
  ADMIN("Администратор"),
  CUSTOMER("Покупатель");
  private final String text;

  Role(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}