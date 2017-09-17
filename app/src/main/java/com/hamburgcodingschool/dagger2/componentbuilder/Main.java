package com.hamburgcodingschool.dagger2.componentbuilder;

public final class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.builder()
        .build();

    // Do something.
  }
}
