package com.hamburgcodingschool.dagger2.e18complex.user;

public final class User {
  public final String userName;

  public User(final String userName) {
    this.userName = userName;
  }

  @Override public String toString() {
    return "User{" + "userName='" + userName + '\'' + '}';
  }
}
