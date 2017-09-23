package com.hamburgcodingschool.dagger2.e06injectconstructor;

public final class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.builder()
        .build();

    final SomeClass someClass = component.someClass();
  }
}
