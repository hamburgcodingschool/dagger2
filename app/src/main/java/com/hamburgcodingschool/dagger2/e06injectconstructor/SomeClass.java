package com.hamburgcodingschool.dagger2.e06injectconstructor;

import com.hamburgcodingschool.dagger2.Database;
import javax.inject.Inject;

public final class SomeClass {
  private final Database database;

  @Inject public SomeClass(final Database database) {
    this.database = database;
  }

  public void doSomething() {
    System.out.println(database.getUser());
  }
}
