package org.exercises.oop.principles.cars;

public final class Lorry extends Car {

  private int carrying;

  public Lorry(int carrying, String marka, String carClass, String engineCompany, int enginePower,
      String driverName,
      int driverAge, int driverExperience) {
    super(marka, carClass, engineCompany, enginePower, driverName, driverAge, driverExperience);
    this.carrying = carrying;
  }

  public int getCarrying() {
    return carrying;
  }

  public void setCarrying(int carrying) {
    this.carrying = carrying;
  }

  @Override
  public String toString() {
    return super.toString() + "\nГрузоподъемность: " + carrying + " тонн";
  }
}