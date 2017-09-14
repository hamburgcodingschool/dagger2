package com.hamburgcodingschool.dagger2.firstsomeclass;

public class Main {
  public void something() {
    final ApplicationComponent component = DaggerApplicationComponent.create();
    final SomeClass someClass = component.someClass();
  }
}
