package com.hamburgcodingschool.dagger2.e04provider;

import com.hamburgcodingschool.dagger2.Database;
import javax.inject.Provider;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final Provider<Database> databaseProvider = component.database();
    final Database database = databaseProvider.get();
  }
}
