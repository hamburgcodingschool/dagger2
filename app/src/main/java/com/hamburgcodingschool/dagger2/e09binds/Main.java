package com.hamburgcodingschool.dagger2.e09binds;

import com.hamburgcodingschool.dagger2.Database;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final Database database = component.database();
  }
}
