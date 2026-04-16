package org.exercises.oop.itogproject.ru.store.online.model.enumeration;

public enum Manufacturer {
  LIPTON("Lipton"),
  NESCAFE("Nescafe"),
  JACOBS("Jacobs"),
  RICHARDS("Richards"),
  TASTY_COFFEE("Tasty Coffee"),
  GREENFIELD("Greenfield"),
  ITO_EN("Ito En"),
  ILLY("Illy"),
  AHMAD("Ahmad"),
  MORNING_COFFEE("Morning Coffee");

  private final String text;

  Manufacturer(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}