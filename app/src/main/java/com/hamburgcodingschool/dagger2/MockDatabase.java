package com.hamburgcodingschool.dagger2;

public final class MockDatabase implements Database {
  private final User mockUser;

  public MockDatabase() {
    mockUser = new User("mock", "user");
  }

  @Override public User getUser() {
    return mockUser;
  }
}
