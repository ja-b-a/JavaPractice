package org.exercises.oop.itogproject.ru.store.online.model;

import org.exercises.oop.itogproject.ru.store.online.model.enumeration.Role;

public final class User {

  private String name;
  private String lastName;
  private String phone;
  private String mail;
  private final String login;
  private String password;
  private Role role;

  public User(String name, String lastName, String phone, String mail, String login,
      String password, Role role) {
    this.name = name;
    this.lastName = lastName;
    this.phone = phone;
    this.mail = mail;
    this.login = login;
    this.password = password;
    this.role = role;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "User{name: %s, lastName: %s, mail: %s, role: %s}"
        .formatted(name, lastName, mail, role.getText());
  }
}