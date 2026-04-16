package org.exercises.oop.principles.student;

public class Student {

  private final String firstName;
  private final String lastName;
  private final String group;
  private final double averageMark;

  public Student(String firstName, String lastName, String group, double averageMark) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.group = group;
    this.averageMark = averageMark;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public double getAverageMark() {
    return averageMark;
  }

  public String getGroup() {
    return group;
  }

  public int getScholarship() {
    if (averageMark == 5.0) {
      return 2000;
    } else {
      return 1900;
    }
  }
}