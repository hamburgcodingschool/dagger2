package com.hamburgcodingschool.dagger2.e05injectfield;

import com.hamburgcodingschool.dagger2.Database;
import javax.inject.Inject;

public final class Main {
  @Inject Database database;

  public void something() {
    DaggerApplicationComponent.builder()
        .build()
        .inject(this);
  }
}
