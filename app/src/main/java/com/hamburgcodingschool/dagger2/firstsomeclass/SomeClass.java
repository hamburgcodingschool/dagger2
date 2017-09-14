package com.hamburgcodingschool.dagger2.firstsomeclass;

import com.hamburgcodingschool.dagger2.Database;

public final class SomeClass {
  private final Database database;

  public SomeClass(final Database database) {
    this.database = database;
  }

  public void doSomething() {
    System.out.println(database.getUser());
  }
}
