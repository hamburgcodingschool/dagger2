package com.hamburgcodingschool.dagger2.e01first;

import com.hamburgcodingschool.dagger2.Database;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final Database database = component.database();
  }
}
