package com.hamburgcodingschool.dagger2.lazy;

import com.hamburgcodingschool.dagger2.Database;
import dagger.Lazy;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final Lazy<Database> databaseLazy = component.database();
    final Database database = databaseLazy.get();
  }
}
