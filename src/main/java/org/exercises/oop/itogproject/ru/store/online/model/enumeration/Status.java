package org.exercises.oop.itogproject.ru.store.online.model.enumeration;

public enum Status {
  NEW("Новый"),
  PAID("Оплачен"),
  APPROVED("Подтверждён"),
  CANCELLED("Отменён"),
  IN_TRANSIT("В пути"),
  DELIVERED("Доставлен"),
  DONE("Выполнен");

  private final String text;

  Status(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}