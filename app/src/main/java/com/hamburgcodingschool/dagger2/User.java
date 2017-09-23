package com.hamburgcodingschool.dagger2;

public final class User {
  private final String firstName;
  private final String lastName;

  public User(final String firstName, final String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }
}
