package com.hamburgcodingschool.dagger2.injectfield;

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
